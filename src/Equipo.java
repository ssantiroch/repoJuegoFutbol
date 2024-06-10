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

    public Equipo() {
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
}
