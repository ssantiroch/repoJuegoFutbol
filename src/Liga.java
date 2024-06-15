public class Liga {

    public String nombreLiga;
    public Equipo[] equiposEnLiga = new Equipo[32];

    public Liga(String nombreLiga){
        this.nombreLiga = nombreLiga;
    }

    public String getNombreLiga() {
        return nombreLiga;
    }

    public void setNombreLiga(String nombreLiga) {
        this.nombreLiga = nombreLiga;
    }
}
