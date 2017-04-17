package main;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 * Clase controladora del panel de login
 * @author Bernat Montoro, Sergio Martínez, Laura Bujalance
 */
public class LoginController implements Initializable {
    /**
     * campo de texto para el nombre de usuario
     */
 @FXML private TextField user;
 /**
  * campo de texto para la contraseña
  */
 @FXML private TextField password;
 /**
  * botón de inicio de sesión
  */
 @FXML private Button loginButton;
 /**
  * mensaje informativo sobre el inicio de sesión
  */
 @FXML private Label messageLoginFx;
 /**
  * mensaje informativo sobre la conectividad
  */
 @FXML private Label mensajeConexion;
 /**
  * checkbox para iniciar sesión como usuario
  */
 @FXML private CheckBox valdiationUsuarioLogin;
 /**
  * checkbox para iniciar sesión como empleado
  */
 @FXML private CheckBox valdiationEmpleadoLogin;
    /**
     * Inicia la clase controladora
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
/**
 * Método que comprueba la conectividad
 * @param admLogin 
 */
public void initManager(final administrarLogin admLogin) {
        /////////////////////////////////////////////////////////////////
        // Start --> Socols  
        //Traduccion direccion por IP
        String hostEntidad = "www.firabarcelona.com";
        String SERVER_ADDRESS = "";
        Integer TCP_SERVER_PORT = 80;    
        try {
            InetAddress ipaddress = InetAddress.getByName(hostEntidad);
            SERVER_ADDRESS = ipaddress.getHostAddress();
            mensajeConexion.setText("Conexión Establecida");
        } catch ( UnknownHostException e ) {
            System.out.println("Error al establecer conexión");
            mensajeConexion.setText("Error al establecer conexión");

        }   
        //Check Connection     
        // End --> Socols 
        /////////////////////////////////////////////////////////////////
        
        valdiationUsuarioLogin.setOnAction((ActionEvent event) -> {
            if(valdiationEmpleadoLogin.isSelected()){
                valdiationEmpleadoLogin.setSelected(false);
            }
        });
        valdiationEmpleadoLogin.setOnAction((ActionEvent event) -> {
            if(valdiationUsuarioLogin.isSelected()){
                valdiationUsuarioLogin.setSelected(false);
            }
        });
        
                
        if(hostAvailabilityCheck(SERVER_ADDRESS, TCP_SERVER_PORT )){
            loginButton.setOnAction((ActionEvent event) -> {
              
                    String usuario = autorizar();
                    String sessionID2 = generateSessionID(); 
                    if ("cliente".equals(usuario)) admLogin.autentificacion(sessionID2);
                    else admLogin.autentificacionEmpleado(sessionID2);
               
            });
        }
  }
/**
 * Método que realiza la validación de las credenciales del usuario para iniciar sesión
 * @return Que tipo de usuario inicia sesión cliente/empleado
 * @throws ExcepcionAutenticacion en caso de error de credenciales
 */
private String autorizar(){
    
   return "";
}
/**
 * Método que genera un ID de sesión
 * @return ID de sesión
 */
  private String generateSessionID() {
    return (user.getText());
  }
 /**
  * Método que comprueba la conexión via sockets
  * @param SERVER_ADDRESS
  * @param TCP_SERVER_PORT
  * @return true/false si hay conexión
  */ 
  public static boolean hostAvailabilityCheck(String SERVER_ADDRESS, Integer TCP_SERVER_PORT ) { 
           try (Socket s = new Socket(SERVER_ADDRESS, TCP_SERVER_PORT)) {
               return true;
           } catch (IOException ex) {        
           }
           return false;
    } 
}
