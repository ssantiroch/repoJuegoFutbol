public class Jugador {

    private String nombreJugador;
    private Posiciones posicionJugador;

    private float costoJugador;
    private double ataqueJuegador;
    private double defensaJugador;
    private int golesJugador;
    
    enum Posiciones {
        Portero,
        Defensor,
        Mediocampista,
        Delantero,
    }

    public Jugador() {
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Enum getPosicionJugador() {
        return posicionJugador;
    }

    public void setPosicionJugador(Posiciones posicionJugador) {
        this.posicionJugador = posicionJugador;
    }

    public float getCostoJugador() {
        return costoJugador;
    }

    public void setCostoJugador(float costoJugador) {
        this.costoJugador = costoJugador;
    }

    public double getAtaqueJuegador() {
        return ataqueJuegador;
    }

    public void setAtaqueJuegador(double ataqueJuegador) {
        this.ataqueJuegador = ataqueJuegador;
    }

    public double getDefensaJugador() {
        return defensaJugador;
    }

    public void setDefensaJugador(double defensaJugador) {
        this.defensaJugador = defensaJugador;
    }

    public int getGolesJugador() {
        return golesJugador;
    }

    public void setGolesJugador(int golesJugador) {
        this.golesJugador = golesJugador;
    }
    @Override
    public String toString() {
        return "Jugador{" +
                "nombreJugador='" + nombreJugador + '\'' +
                ", posicionJugador=" + posicionJugador +
                ", costoJugador=" + costoJugador +
                ", ataqueJuegador=" + ataqueJuegador +
                ", defensaJugador=" + defensaJugador +
                ", valoracionTotal=" + valoracionTotal +
                '}';
    }
}
