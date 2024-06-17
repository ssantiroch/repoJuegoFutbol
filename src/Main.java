import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Jugador[] jugadoresEquipoUsuario = { new Jugador("Jugador1", 10), new Jugador("Jugador2", 9) };
        Jugador[] jugadoresBoca = { new Jugador("Jugador3", 7), new Jugador("Jugador4", 8) };
        Jugador[] jugadoresRiver = { new Jugador("Jugador5", 6), new Jugador("Jugador6", 7) };
        Jugador[] jugadoresRacing = { new Jugador("Jugador7", 6), new Jugador("Jugador8", 7) };
        Jugador[] jugadoresIndependiente = { new Jugador("Jugador9", 6), new Jugador("Jugador10", 7) };
        Jugador[] jugadoresSanLorenzo = { new Jugador("Jugador11", 6), new Jugador("Jugador12", 7) };

        Equipo equipoUsuario = new Equipo("Equipo del Usuario", "Usuario", 1000000, jugadoresEquipoUsuario);
        Equipo boca = new Equipo("Boca Juniors", "Diego Martinez", 5000000, jugadoresBoca);
        Equipo river = new Equipo("River Plate", "Martin Demichelis", 4000000, jugadoresRiver);
        Equipo racing = new Equipo("Racing Club", "Gustavo Costas", 4500000, jugadoresRacing);
        Equipo independiente = new Equipo("Independiente", "Carlos Tevez", 3500000, jugadoresIndependiente);
        Equipo sanLorenzo = new Equipo("San Lorenzo", "Leandro Romagnoli", 3000000, jugadoresSanLorenzo);

        List<Equipo> ligaArgentina = new ArrayList<>();
        ligaArgentina.add(boca);
        ligaArgentina.add(river);
        ligaArgentina.add(racing);
        ligaArgentina.add(independiente);
        ligaArgentina.add(sanLorenzo);

        Jugador[] jugadoresRealMadrid = {new Jugador("Jugador13", 6), new Jugador("Jugador14", 7)};
        Jugador[] jugadoresBarcelona = {new Jugador("Jugador15", 6), new Jugador("Jugador16", 7)};
        Jugador[] jugadoresAtletico = {new Jugador("Jugador17", 6), new Jugador("Jugador18", 7)};
        Jugador[] jugadoresSevilla = {new Jugador("Jugador19", 6), new Jugador("Jugador20", 7)};
        Jugador[] jugadoresValencia = {new Jugador("Jugador21", 6), new Jugador("Jugador22", 7)};

        // Crear equipos de la liga española
        Equipo realMadrid = new Equipo("Real Madrid", "Carlo Ancelotti", 10000000, jugadoresRealMadrid);
        Equipo barcelona = new Equipo("Barcelona", "Hansi Flick", 9000000, jugadoresBarcelona);
        Equipo atletico = new Equipo("Atlético de Madrid", "Diego Simeone", 8000000, jugadoresAtletico);
        Equipo sevilla = new Equipo("Sevilla", "Quique Sánchez Flores", 7000000, jugadoresSevilla);
        Equipo valencia = new Equipo("Valencia", "Rubén Baraja", 6000000, jugadoresValencia);

        List<Equipo> ligaEspana = new ArrayList<>();
        ligaEspana.add(realMadrid);
        ligaEspana.add(barcelona);
        ligaEspana.add(atletico);
        ligaEspana.add(sevilla);
        ligaEspana.add(valencia);

        // Crear jugadores para los equipos de la liga inglesa
        Jugador[] jugadoresManchesterCity = {new Jugador("Jugador23", 6), new Jugador("Jugador24", 7)};
        Jugador[] jugadoresLiverpool = {new Jugador("Jugador25", 6), new Jugador("Jugador26", 7)};
        Jugador[] jugadoresChelsea = {new Jugador("Jugador27", 6), new Jugador("Jugador28", 7)};
        Jugador[] jugadoresManchesterUnited = {new Jugador("Jugador29", 6), new Jugador("Jugador30", 7)};
        Jugador[] jugadoresTottenham = {new Jugador("Jugador31", 6), new Jugador("Jugador32", 7)};

        // Crear equipos de la liga inglesa
        Equipo manchesterCity = new Equipo("Manchester City", "Pep Guardiola", 12000000, jugadoresManchesterCity);
        Equipo liverpool = new Equipo("Liverpool", "Arne Slot", 11000000, jugadoresLiverpool);
        Equipo chelsea = new Equipo("Chelsea", "Enzo Maresca", 10000000, jugadoresChelsea);
        Equipo manchesterUnited = new Equipo("Manchester United", "Erik Ten Hag", 9000000, jugadoresManchesterUnited);
        Equipo tottenham = new Equipo("Tottenham Hotspur", "Ange Postecoglou", 8000000, jugadoresTottenham);

        List<Equipo> ligaInglesa = new ArrayList<>();
        ligaInglesa.add(manchesterCity);
        ligaInglesa.add(liverpool);
        ligaInglesa.add(chelsea);
        ligaInglesa.add(manchesterUnited);
        ligaInglesa.add(tottenham);

        ligaArgentina.add(equipoUsuario);
        Liga ligaActual = new Liga(ligaArgentina, equipoUsuario);
        while (true) {
            ligaActual.mostrarMenu();
            if (ligaActual.verificarAscenso()) {
                if (ligaActual.getEquipos() == ligaArgentina) {
                    System.out.println("¡Felicitaciones! Has ascendido a La Liga.");
                    ligaEspana.add(equipoUsuario);
                    ligaActual = new Liga(ligaEspana, equipoUsuario);
                } else if (ligaActual.getEquipos() == ligaEspana) {
                    System.out.println("¡Felicitaciones! Has ascendido a la Premier League.");
                    ligaInglesa.add(equipoUsuario);
                    ligaActual = new Liga(ligaInglesa, equipoUsuario);
                } else {
                    // Si se verifica el ascenso en ligaInglesa, ya no hay más ligas a las que ascender
                    System.out.println("¡Has ganado la Premier League! No hay más ligas a las que ascender.");
                    break;
                }
                // Mostrar el menú después de ascender a la siguiente liga
                ligaActual.mostrarMenu();
            } else {
                System.out.println("No lograste ascender. Jugarás otra temporada en la misma liga.");
                ligaActual.reiniciarLiga();
            }
        }
    }
}
