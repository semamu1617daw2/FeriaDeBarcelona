package login;

/**
 *
 * @author Sergio Martinez Mulero
 * @date 03-abr-2017
 */
public class Empresa extends Usuario {
    
    private String CIF;
    private String NomEmpresa;
    private String Direccion;
    private String Representante;
    
    public Empresa(String Codigo, String Contraseña,String cif, String nombre, String direccion, String representante){
        super(Codigo, Contraseña);
        this.CIF = cif;
        this.NomEmpresa = nombre;
        this.Direccion = direccion;
        this.Representante = representante;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getNomEmpresa() {
        return NomEmpresa;
    }

    public void setNomEmpresa(String NomEmpresa) {
        this.NomEmpresa = NomEmpresa;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getRepresentante() {
        return Representante;
    }

    public void setRepresentante(String Representante) {
        this.Representante = Representante;
    }

    @Override
    public String toString() {
        return "Empresa{" + "CIF=" + CIF + ", NomEmpresa=" + NomEmpresa + ", Direccion=" + Direccion + ", Representante=" + Representante + '}';
    }

   
    
}
    
    