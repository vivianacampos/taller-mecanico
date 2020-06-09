
package cl.dvl.tallermecanico.interfaz;

public class Usuario {
    private int idUsuario;
    private String usuario;
    private String password;
    private String perfil;

    public Usuario() {
    }

    public Usuario(int idUsuario, String usuario, String password, String perfil) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
        this.perfil = perfil;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
