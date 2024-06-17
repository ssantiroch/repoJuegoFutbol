public class Equipo {

    public String nombreEquipo;

    public String dtEquipo;

    private float presupuestoEquipo;

    public int puntajeEquipo;

    private Jugador[] jugadoresEquipo;

    private boolean ventajaDeEquipo;
    private int victorias;
    private int empates;
    private int derrotas;
    public int puntos;

    public Equipo() {
        calcularPuntajeEquipo();
    }

    public Equipo(String nombreEquipo, String dtEquipo, int puntajeEquipo, Jugador[] jugadoresEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.dtEquipo = dtEquipo;
        this.puntajeEquipo = puntajeEquipo;
        this.jugadoresEquipo = jugadoresEquipo;
        calcularPuntajeEquipo();
    }

    public Equipo(String nombreEquipo, String dtEquipo, int puntajeEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.dtEquipo = dtEquipo;
        this.puntajeEquipo = puntajeEquipo;
        calcularPuntajeEquipo();
    }

    private void calcularPuntajeEquipo(){
        int puntaje=0;
        for(int i = 0; i < jugadoresEquipo.length; i++){
            puntaje += jugadoresEquipo[i].getValoracionTotal();
        }
        this.puntajeEquipo = puntaje;
    }

    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }
    public void sumarPresupuesto(int dinero){
        this.presupuestoEquipo += dinero;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getDtEquipo() {
        return dtEquipo;
    }

    public void setDtEquipo(String dtEquipo) {
        this.dtEquipo = dtEquipo;
    }

    public float getPresupuestoEquipo() {
        return presupuestoEquipo;
    }

    public void setPresupuestoEquipo(float presupuestoEquipo) {
        this.presupuestoEquipo = presupuestoEquipo;
    }

    public int getPuntajeEquipo() {
        return puntajeEquipo;
    }

    public void setPuntajeEquipo(int puntajeEquipo) {
        this.puntajeEquipo = puntajeEquipo;
    }

    public Jugador[] getJuegadoresEquipo() {
        return jugadoresEquipo;
    }

    public void setJuegadoresEquipo(Jugador[] juegadoresEquipo) {
        this.jugadoresEquipo = juegadoresEquipo;
    }

    public boolean isVentajaDeEquipo() {
        return ventajaDeEquipo;
    }

    public void setVentajaDeEquipo(boolean ventajaDeEquipo) {
        this.ventajaDeEquipo = ventajaDeEquipo;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
