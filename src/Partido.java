import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class Partido extends Liga{

    public Equipo equipoLocalPartido;
    public int golesLocal;
    public Equipo equipoVisitantePartido;
    public int golesVisitante;
    public Partido(String nombreLiga) {
        super(nombreLiga);

    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public void jugarPartido(){
        Random rand = new Random();
        Scanner teclado = new Scanner(System.in);

        int iL = rand.nextInt(3) + 1;
        int iV = rand.nextInt(3)+ 1;

        int oportunidadesLocal = 5;
        int oportunidadesVisitante = 5;

        if(equipoLocalPartido.puntajeEquipo > equipoVisitantePartido.puntajeEquipo){
            equipoLocalPartido.setVentajaDeEquipo(true);
            equipoVisitantePartido.setVentajaDeEquipo(false);
        }
        else{
            equipoVisitantePartido.setVentajaDeEquipo(true);
            equipoLocalPartido.setVentajaDeEquipo(false);
        }
        while(oportunidadesLocal > 0 && oportunidadesVisitante > 0){
            System.out.println("Elige donde patear");
            System.out.println("Izquierda(1) - Centro(2) - Derecha(3)");
            int opcion = teclado.nextInt();
            System.out.println(equipoLocalPartido.nombreEquipo+" " +golesLocal + " "+golesVisitante+" " +equipoVisitantePartido.nombreEquipo);
            if(opcion != iV){
                System.out.println("¡¡GOL DE " +equipoLocalPartido.nombreEquipo+ "!!");
                golesLocal++;
                System.out.println(" "+iV);
            }
            else{
                System.out.println("Atajo el arquero de "+ equipoVisitantePartido.nombreEquipo);
            }
            System.out.println("Elige donde atajar");
            System.out.println("Izquierda(1) - Centro(2) - Derecha(3)");
            opcion = teclado.nextInt();
            if(opcion == iL){
                System.out.println("¡¡Atajaste!!");
                System.out.println(" "+iL);
            }
            else{
                System.out.println("¡¡Gol de "+equipoVisitantePartido.nombreEquipo+"!!");
            }
            oportunidadesLocal--;
            oportunidadesVisitante--;
        }
        if(golesLocal > golesVisitante){
            int victoria = equipoLocalPartido.getVictorias();
            equipoLocalPartido.setVictorias(victoria++);
            int derrota = equipoVisitantePartido.getDerrotas();
            equipoVisitantePartido.setDerrotas(derrota++);
        }
        else{
            int victoria = equipoVisitantePartido.getVictorias();
            equipoVisitantePartido.setVictorias(victoria++);
            int derrota = equipoLocalPartido.getDerrotas();
            equipoLocalPartido.setDerrotas(derrota++);
        }
    }
}
