package main;

/**
 *
 * @author Sergio Martinez Mulero
 * @date 03-abr-2017
 */
public class Stand {

    private Integer IdStand;
    private String Palacio;
    private Float TamañoPalacio;
    private String NomExposicion;

    public  Stand(Integer id, String Palacio, Float TamañoPalacio, String NomExposicion ){
            this.IdStand = id;
            this.Palacio = Palacio;
            this.TamañoPalacio = TamañoPalacio;
            this.NomExposicion = NomExposicion;
    }

    @Override
    public String toString(){
            return "";
    }

    public Integer getIdStand() {
        return IdStand;
    }

    public void setIdStand(Integer IdStand) {
        this.IdStand = IdStand;
    }

    public String getPalacio() {
        return Palacio;
    }

    public void setPalacio(String Palacio) {
        this.Palacio = Palacio;
    }

    public Float getTamañoPalacio() {
        return TamañoPalacio;
    }

    public void setTamañoPalacio(Float TamañoPalacio) {
        this.TamañoPalacio = TamañoPalacio;
    }

    public String getNomExposicion() {
        return NomExposicion;
    }

    public void setNomExposicion(String NomExposicion) {
        this.NomExposicion = NomExposicion;
    }
	
        
}
