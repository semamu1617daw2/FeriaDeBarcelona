package main;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.PreparedStatement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe que realitza operacions sobre una taula Alumne. Utilitza una classe
 * d'utilitat per a gestionar la connexió a la BD i els camps són autonumèrics.
 * Utilitza Sentències preparades
 *
 * @author sergi grau
 * @version 1.0 14.02.2012
 */
public class TracatamentAlumnesNotesSentenciesPreparades {

    private static Connection conn;
    private static PreparedStatement pstmt;
    private static BDAccessor bd = null;

    public static void main(String args[]) {

        bd = new BDAccessor();
        try {
            conn = bd.obtenirConnexio();

            menuTractamentAlumnes();
        } catch (InputMismatchException ex) {
            System.out.println("opció incorrecta");
        } catch (SQLException ex) {
            for (Throwable t : ex) {
                t.printStackTrace();
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Mètode estàtic que crea el menu amb les opcions
     *
     * @throws SQLException
     * @throws IOException
     * @throws InputMismatchException Excepció corresponent a la introducció
     * d'una tecla
     */
    public static void menuTractamentAlumnes() throws SQLException, IOException, InputMismatchException, ClassNotFoundException {

        int opcio;
        do {
            System.out.println("1. Afegeix Stand");
            System.out.println("2. Consulta tots els Stands");
            System.out.println("3. Consulta Stands segons IdStand");
            System.out.println("4. Surt");
            Scanner entrada = new Scanner(System.in);
            opcio = entrada.nextInt();
            String basura;

            switch (opcio) {
                case 1:
                    entrada = new Scanner(System.in);
                    System.out.print("IdStand:");
                    Integer IdStand = entrada.nextInt();
                    entrada = new Scanner(System.in);
                    System.out.print("Num_Stand:");
                    Integer Num_Stand = entrada.nextInt();
                    basura = entrada.nextLine();
                    System.out.print("Palacio:");
                    String Palacio = entrada.nextLine();
                    System.out.print("Tamaño:");
                    Double Tamaño = entrada.nextDouble();
                    basura = entrada.nextLine();
                    System.out.print("NombreExpo:");
                    String NombreExpo = entrada.nextLine();
                    afegirAlumne(IdStand, Num_Stand, Palacio, Tamaño, NombreExpo);
                    break;
                case 2:
                    consultarAlumnes();
                    break;
                case 3:
                    entrada = new Scanner(System.in);
                    System.out.print("nota:");
                    String condicio = entrada.nextLine();
                    consultarAlumnes(condicio);
                    break;
                case 4:
                    BDAccessor.tancarPreparedStatement(pstmt);
                    BDAccessor.tancarConnexio(conn);
                    break;
                default:
                    System.out.println("opció incorrecta");
                    break;
            }
        } while (opcio != 4);
    }

    public static void afegirAlumne(Integer IdStand, Integer Num_Stand, String Palacio, Double Tamaño, String NombreExpo) throws SQLException {
        try {
            String cadenaSQL = "INSERT INTO Stands(IdStand,Num_Stand,Palacio,Tamaño,NombreExpo) VALUES(?,?,?,?,?)";
            pstmt = conn.prepareStatement(cadenaSQL, PreparedStatement.RETURN_GENERATED_KEYS);
            pstmt.setInt(1, IdStand);
            pstmt.setInt(2, Num_Stand);
            pstmt.setString(3, Palacio);
            pstmt.setDouble(4, Tamaño);
            pstmt.setString(5, NombreExpo);

            int n = pstmt.executeUpdate();
            try (ResultSet rs = pstmt.getGeneratedKeys()) {
                while (rs.next()) {
                    System.out.println("Codi generat per getGeneratedKeys():"
                            + rs.getInt(1));
                }
            }
            System.out.println("S'ha afegit " + n + " items");

        } finally {
            pstmt.clearParameters();
        }
    }

    /**
     * Mètode que mostra tots els alumnes
     *
     * @throws SQLException
     */
    public static void consultarAlumnes() throws SQLException {

        try {
            String cadenaSQL = "SELECT * FROM Stands";
            pstmt = conn.prepareStatement(cadenaSQL);
            try (ResultSet resultat = pstmt.executeQuery()) {
                while (resultat.next()) {
                    System.out.println(resultat.getInt(1)
                            + "-" + resultat.getString(2)
                            + "-" + resultat.getString(3));
                }
            }

        } finally {
        }
    }

    /*
     * Mostra tots els alumnes amb una nota major a nota
     */

    public static void consultarAlumnes(String nota) throws SQLException {

        try {
            String cadenaSQL = "SELECT * FROM alumne WHERE nota > ?";
            pstmt = conn.prepareStatement(cadenaSQL);
            pstmt.setFloat(1, Float.parseFloat(nota));

            try (ResultSet resultat = pstmt.executeQuery()) {
                while (resultat.next()) {
                    System.out.println(resultat.getInt(1)
                            + "-" + resultat.getString(2)
                            + "-" + resultat.getString(3));
                }
            }

        } finally {
            pstmt.clearParameters();
        }
    }
}
