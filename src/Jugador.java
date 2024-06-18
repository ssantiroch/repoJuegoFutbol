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

    public Jugador(String nombreJugador, int valoracionTotal) {
        this.nombreJugador = nombreJugador;
        this.valoracionTotal = valoracionTotal;
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
        calcularCostoVenta();
        calcularValoracionTotal();
    }

    private void calcularCostoVenta() {
        this.costoVenta = this.costoJugador / 2;
    }

    /*private void calcularValoracionTotal() {
        this.valoracionTotal = (this.ataqueJugador + this.defensaJugador) / 2;
    }*/
public double calcularValoracionTotal() {
        // Ponderaciones para cada atributo
        double ponderacionCosto = 0.25; // 25%
        double ponderacionAtaque = 0.35; // 35%
        double ponderacionDefensa = 0.25; // 25%
        double ponderacionGoles = 0.15; // 15%

        // Normalización de los atributos (opcional, depende de tus necesidades)
        double costoNormalizado = costoJugador / 100; // Suponiendo que el costo está en millones
        double ataqueNormalizado = ataqueJugador / 100; // Ataque en una escala de 0 a 100
        double defensaNormalizada = defensaJugador / 100; // Defensa en una escala de 0 a 100
        double golesNormalizados = golesJugador / 50; // Suponiendo que 50 goles es un valor máximo razonable

        // Cálculo de la valoración total ponderada
        double valoracionTotal = (costoNormalizado * ponderacionCosto) +
                                 (ataqueNormalizado * ponderacionAtaque) +
                                 (defensaNormalizada * ponderacionDefensa) +
                                 (golesNormalizados * ponderacionGoles);

        // Escalar la valoración total a una escala de 0 a 100 (opcional)
        valoracionTotal *= 100;

        return valoracionTotal;
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
