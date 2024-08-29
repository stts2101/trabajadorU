public class Administrativo extends Trabajador{
    // horario de atención
    private String horarioAtencion;

    public Administrativo(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

}
