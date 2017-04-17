package main;

/**
 *
 * @author Sergio Martinez Mulero
 * @date 03-abr-2017
 */
public class Palacio {
    
    private Integer IdPalacio;
    private String NombrePalacio;
    private Double TamañoPalacio;
    private Integer NumDeStands;
    private String Ubicacion;
    
    public Palacio(Integer id, String nombre, Double tamaño, Integer numero, String ubicacion){
        
        this.IdPalacio = id;
        this.NombrePalacio = nombre;
        this.TamañoPalacio = tamaño;
        this.NumDeStands = numero;
        this.Ubicacion = ubicacion;
        
    }

    public Integer getIdPalacio() {
        return IdPalacio;
    }

    public void setIdPalacio(Integer IdPalacio) {
        this.IdPalacio = IdPalacio;
    }

    public String getNombrePalacio() {
        return NombrePalacio;
    }

    public void setNombrePalacio(String NombrePalacio) {
        this.NombrePalacio = NombrePalacio;
    }

    public Double getTamañoPalacio() {
        return TamañoPalacio;
    }

    public void setTamañoPalacio(Double TamañoPalacio) {
        this.TamañoPalacio = TamañoPalacio;
    }

    public Integer getNumDeStands() {
        return NumDeStands;
    }

    public void setNumDeStands(Integer NumDeStands) {
        this.NumDeStands = NumDeStands;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
    
    
}
