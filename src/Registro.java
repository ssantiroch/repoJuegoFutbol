import java.util.Scanner;
import java.util.UUID;

public class Registro extends Usuario {
    public String generarID(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
    public void registrarUsuario(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("REGISTRO DE USUARIO");
        setIdUsuario(generarID());
        System.out.println("ID: "+getIdUsuario());
        System.out.println("Nombre de Usuario: ");
        setNombreUsuario(scanner.next());
        System.out.println("Email: ");
        setEmail(scanner.next());
        System.out.println("Contraseña: ");
        setContraseñaUsuario(scanner.next());
        setAdministrador(false);
    }

    public void registrarAdministrador(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("REGISTRO DE ADMINISTRADOR");
        setIdUsuario(generarID());
        System.out.println("ID: "+getIdUsuario());
        System.out.println("Nombre de Usuario: ");
        setNombreUsuario(scanner.next());
        System.out.println("Email: ");
        setEmail(scanner.next());
        System.out.println("Contraseña: ");
        setContraseñaUsuario(scanner.next());
        setAdministrador(true);
    }


}
