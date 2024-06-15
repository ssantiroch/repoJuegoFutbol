public class Jugador {

    private String nombreJugador;
    private Posiciones posicionJugador;

    private float costoJugador;
    private int ataqueJugador;
    private int defensaJugador;
    private int golesJugador;
    private float costoVenta;
    private int valoracionTotal;

    enum Posiciones {
        Portero,
        Defensor,
        Mediocampista,
        Delantero,
    }

    public Jugador() {
        this.costoVenta = costoJugador/2;
        this.valoracionTotal = (ataqueJugador+defensaJugador)/2;
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
        return ataqueJugador;
    }

    public void setAtaqueJuegador(int ataqueJuegador) {
        this.ataqueJugador = ataqueJuegador;
    }

    public double getDefensaJugador() {
        return defensaJugador;
    }

    public void setDefensaJugador(int defensaJugador) {
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
                ", ataqueJuegador=" + ataqueJugador +
                ", defensaJugador=" + defensaJugador +
                ", valoracionTotal=" + valoracionTotal +
                '}';
    }
}
