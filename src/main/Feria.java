package main;

/**
 *
 * @author Sergio Martinez Mulero
 * @date 03-abr-2017
 */
public class Feria {
    
    private String Nombre;
    private String Ciudad;
    private Double Tamaño;
    private String Organizador;
    private Integer NumPalacion;
    
    public Feria(String nombre, String ciudad, Double tamaño, String organizador, Integer numero){
        
        this.Nombre = nombre;
        this.Ciudad = ciudad;
        this.Tamaño = tamaño;
        this.Organizador = organizador;
        this.NumPalacion = numero;
  
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public Double getTamaño() {
        return Tamaño;
    }

    public void setTamaño(Double Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getOrganizador() {
        return Organizador;
    }

    public void setOrganizador(String Organizador) {
        this.Organizador = Organizador;
    }

    public Integer getNumPalacion() {
        return NumPalacion;
    }

    public void setNumPalacion(Integer NumPalacion) {
        this.NumPalacion = NumPalacion;
    }
      
}