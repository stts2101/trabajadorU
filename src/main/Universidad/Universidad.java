import java.util.ArrayList;

public class Universidad {
    // nombre, direcciones asociadas y el tipo de Universidad
    protected String nombreUniversidad;
    protected String direccionU;
    protected String tipoUniversidad;
    protected ArrayList<Facultad> Facultades;

    public Universidad(String nombreUniversidad, String direccionU, String tipoUniversidad, ArrayList<Facultad> facultades) {
        this.nombreUniversidad = nombreUniversidad;
        this.direccionU = direccionU;
        this.tipoUniversidad = tipoUniversidad;
        Facultades = facultades;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public String getDireccionU() {
        return direccionU;
    }

    public void setDireccionU(String direccionU) {
        this.direccionU = direccionU;
    }

    public String getTipoUniversidad() {
        return tipoUniversidad;
    }

    public void setTipoUniversidad(String tipoUniversidad) {
        this.tipoUniversidad = tipoUniversidad;
    }

    public ArrayList<Facultad> getFacultades() {
        return Facultades;
    }

    public void setFacultades(ArrayList<Facultad> facultades) {
        Facultades = facultades;
    }
}
