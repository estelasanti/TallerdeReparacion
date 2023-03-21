public class TallerdeReparacion {
    private String televisor;
    private int fecha;
    private String dueño;
    private String daño;

    public TallerdeReparacion(String televisor, int fecha, String dueño, String daño) {
        this.televisor = televisor;
        this.fecha = fecha;
        this.dueño = dueño;
        this.daño = daño;
    }

    public String getTelevisor() {
        return televisor;
    }

    public void setTelevisor(String televisor) {
        this.televisor = televisor;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getDaño() {
        return daño;
    }

    public void setDaño(String daño) {
        this.daño = daño;
    }
}
