public class Persona {
    private String nombreUsuario;
    private long idUsuario;
    private String contraseñaUsuario;
    private boolean administrador;
    private String email;

    public Persona() {
    }
public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}

//FALTA: validacion de casi todos los atributos, comprobar repetidos de NombreUsuario, ID, Email
//Buscar la manera de determinar si alguien puede ser admin o usuario}
