public class Profesor extends Trabajador{
    // contratados a jornada
    protected String jornadaProfe;

    public Profesor(String jornadaProfe) {
        this.jornadaProfe = jornadaProfe;
    }

    public String getJornadaProfe() {
        return jornadaProfe;
    }

    public void setJornadaProfe(String jornadaProfe) {
        this.jornadaProfe = jornadaProfe;
    }
}
