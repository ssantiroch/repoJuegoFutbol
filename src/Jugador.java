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

    public Jugador(String nombreJugador, Posiciones posicionJugador, float costoJugador, int ataqueJugador, int defensaJugador) {
        this.nombreJugador = nombreJugador;
        this.posicionJugador = posicionJugador;
        this.costoJugador = costoJugador;
        this.ataqueJugador = ataqueJugador;
        this.defensaJugador = defensaJugador;
        calcularCostoVenta();
        calcularValoracionTotal();
    }

    public Jugador() {

    }

    private void calcularCostoVenta() {
        this.costoVenta = this.costoJugador / 2;
    }

    private void calcularValoracionTotal() {
        this.valoracionTotal = (this.ataqueJugador + this.defensaJugador) / 2;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Posiciones getPosicionJugador() {
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
        calcularCostoVenta();
    }

    public int getAtaqueJugador() {
        return ataqueJugador;
    }

    public void setAtaqueJugador(int ataqueJugador) {
        this.ataqueJugador = ataqueJugador;
        calcularValoracionTotal();
    }

    public int getDefensaJugador() {
        return defensaJugador;
    }

    public void setDefensaJugador(int defensaJugador) {
        this.defensaJugador = defensaJugador;
        calcularValoracionTotal();
    }

    public int getGolesJugador() {
        return golesJugador;
    }

    public void setGolesJugador(int golesJugador) {
        this.golesJugador = golesJugador;
    }

    public float getCostoVenta() {
        return costoVenta;
    }

    public int getValoracionTotal() {
        return valoracionTotal;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombreJugador='" + nombreJugador + '\'' +
                ", posicionJugador=" + posicionJugador +
                ", costoJugador=" + costoJugador +
                ", ataqueJugador=" + ataqueJugador +
                ", defensaJugador=" + defensaJugador +
                ", valoracionTotal=" + valoracionTotal +
                '}';
    }
}
