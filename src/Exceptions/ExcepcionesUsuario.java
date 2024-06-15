package Exceptions;

public class ExcepcionesUsuario extends Exception {

    public ExcepcionesUsuario()
    {
    }

    public void causas (int causa)
    {
        if (causa == 1)
        {
            System.out.println("Usuario inexesistente");
        }
    }


}
