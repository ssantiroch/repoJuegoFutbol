import java.util.Scanner;

public class InicioSesion extends Persona{
    public boolean inicioSesion(){
        boolean sesionIniciada = false;
        Scanner scanner=new Scanner(System.in);
        System.out.println("INICIO DE SESION:");
        System.out.println("Nombre de Usuario o Email: ");
        setNombreUsuario(scanner.next()); // O EMAIL
        System.out.println("Contraseña: ");
        setContraseñaUsuario(scanner.next());
        //comprobacion de usuario y contraseña correcta
        //si los atributos coinciden con alguno de los usuarios en el archivo -> sesionIniciada=true
        return sesionIniciada;
    }

    public boolean inicioSesionAdmin(){
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
