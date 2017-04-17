package login;

/**
 *
 * @author Sergio Martinez Mulero
 * @date 03-abr-2017
 */
public abstract class Usuario {
    
    public String Codigo;
    public String Contraseña;

    public Usuario(String Codigo, String Contraseña) {
        this.Codigo = Codigo;
        this.Contraseña = Contraseña;
    }
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Codigo=" + Codigo + ", Contrase\u00f1a=" + Contraseña + '}';
    }
    
    
}
