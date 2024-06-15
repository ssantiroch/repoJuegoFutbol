import java.util.Scanner;

public class Usuario {
    private String nombreUsuario;
    private String idUsuario;
    private String contraseñaUsuario;
    private boolean administrador;
    private String email;

    public Usuario() {
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
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



    public final boolean inicioSesionAdmin(){
        boolean sesionIniciada = false;
        Scanner scanner=new Scanner(System.in);
        System.out.println("INICIO DE SESION ADMINISTRADOR:");
        System.out.println("Nombre de Usuario o Email: ");
        setNombreUsuario(scanner.next()); // O EMAIL
        System.out.println("Contraseña: ");
        setContraseñaUsuario(scanner.next());
        //comprobacion de usuario y contraseña correcta
        if(isAdministrador()){
            sesionIniciada=true;
        }
        return sesionIniciada;
    }


}

//FALTA: validacion de casi todos los atributos, comprobar repetidos de NombreUsuario, ID, Email
//Buscar la manera de determinar si alguien puede ser admin o usuario}
