import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Liga {
    private List<Equipo> equipos;

    public Liga(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public void jugarPartidoConUsuario() {
        Equipo equipoUsuario = null;
        for (Equipo equipo : equipos) {
            if (equipo.nombreEquipo.equals("Equipo del Usuario")) {
                equipoUsuario = equipo;
                break;
            }
        }

        if (equipoUsuario == null) {
            System.out.println("No se encontró el equipo del usuario en la liga.");
            return;
        }

        Random rand = new Random();

        // Jugar partido del equipo del usuario
        Equipo equipoAleatorio = null;
        do {
            equipoAleatorio = equipos.get(rand.nextInt(equipos.size()));
        } while (equipoAleatorio == equipoUsuario);

        Partido partidoUsuario = new Partido(equipoUsuario, equipoAleatorio);
        partidoUsuario.jugarPartido();

        // Simular partidos de los otros equipos
        for (Equipo equipo : equipos) {
            if (!equipo.nombreEquipo.equals("Equipo del Usuario")) {
                equipoAleatorio = null;
                do {
                    equipoAleatorio = equipos.get(rand.nextInt(equipos.size()));
                } while (equipoAleatorio == equipo);

                Partido partidoSimulado = new Partido(equipo, equipoAleatorio);
                partidoSimulado.jugarPartido();
                System.out.println("Resultado del partido simulado: " + equipo.nombreEquipo + " vs " + equipoAleatorio.nombreEquipo);
                System.out.println("Goles " + equipo.nombreEquipo + ": " + partidoSimulado.getGolesLocal() +
                        " - Goles " + equipoAleatorio.nombreEquipo + ": " + partidoSimulado.getGolesVisitante());
            }
        }
    }
}
