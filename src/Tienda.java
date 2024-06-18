public class Tienda {

    //File jugadoresDeTienda;
    private Carrito carrito;

    public Tienda() {
    }
    public static List<Jugador> leerJugadoresDesdeArchivo(String nombreArchivo) {
        List<Jugador> jugadores = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 8) {
                    String nombreJugador = datos[0];
                    Posiciones posicionJugador = Posiciones.valueOf(datos[1].toUpperCase());
                    float costoJugador = Float.parseFloat(datos[2]);
                    int ataqueJugador = Integer.parseInt(datos[3]);
                    int defensaJugador = Integer.parseInt(datos[4]);
                    int golesJugador = Integer.parseInt(datos[5]);
                    float costoVenta = Float.parseFloat(datos[6]);
                    int valoracionTotal = Integer.parseInt(datos[7]);

                    Jugador jugador = new Jugador(nombreJugador, posicionJugador, costoJugador, ataqueJugador, 
                                                  defensaJugador, golesJugador, costoVenta, valoracionTotal);
                    jugadores.add(jugador);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jugadores;
    }

    public static void mostrarJugadores(List<Jugador> jugadores) {
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }

    public static void main(String[] args) {
        String nombreArchivo = "jugadores.txt";
        List<Jugador> jugadores = leerJugadoresDesdeArchivo(nombreArchivo);
        mostrarJugadores(jugadores);
    }
}
