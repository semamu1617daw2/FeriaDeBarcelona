package login;

/**
 *
 * @author Sergio Martinez Mulero
 * @date 03-abr-2017
 */
public class Administracion extends Usuario {
    
    private String CodigoEmpleado;
    private String NombreEmpleado;
    private String Sector;

    public Administracion(String Codigo, String Contraseña,String CodigoEmpleado,String NombreEmpleado,String Sector) {
        super(Codigo, Contraseña);
        this.CodigoEmpleado = CodigoEmpleado;
        this.NombreEmpleado = NombreEmpleado;
        this.Sector = Sector;
    }

    public String getCodigoEmpleado() {
        return CodigoEmpleado;
    }

    public void setCodigoEmpleado(String CodigoEmpleado) {
        this.CodigoEmpleado = CodigoEmpleado;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public String getSector() {
        return Sector;
    }

    public void setSector(String Sector) {
        this.Sector = Sector;
    }

    @Override
    public String toString() {
        return "Administracion{" + "CodigoEmpleado=" + CodigoEmpleado + ", NombreEmpleado=" + NombreEmpleado + ", Sector=" + Sector + '}';
    }
    
    
}