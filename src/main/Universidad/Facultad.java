import java.util.ArrayList;

public class Facultad {
    //  nombre, ubicación geográfica y departamentos asociados.
    protected String nombreFacultad;
    protected String ubicacionGeo;
    protected ArrayList<Departamento> Departamentos;

    public Facultad(String nombreFacultad, String ubicacionGeo) {
        this.nombreFacultad = nombreFacultad;
        this.ubicacionGeo = ubicacionGeo;

    }

    public String getNombreFacultad() {
        return nombreFacultad;
    }

    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }

    public String getUbicacionGeo() {
        return ubicacionGeo;
    }

    public void setUbicacionGeo(String ubicacionGeo) {
        this.ubicacionGeo = ubicacionGeo;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return Departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        Departamentos = departamentos;
    }
}
