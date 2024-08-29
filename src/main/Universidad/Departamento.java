import java.util.ArrayList;

public class Departamento {
   //  nombre, administrativos, profesores asociados
    protected String nombreDepar;
    protected ArrayList<Profesor> Profes;
    protected ArrayList<Administrativo> Adminis;
    protected ArrayList<CarreraUniversitaria> Carreras;

    public Departamento(String nombreDepar, ArrayList<Profesor> profes, ArrayList<Administrativo> adminis, ArrayList<CarreraUniversitaria> carreras) {
        this.nombreDepar = nombreDepar;
        Profes = profes;
        Adminis = adminis;
        Carreras = carreras;
    }

    public String getNombreDepar() {
        return nombreDepar;
    }

    public void setNombreDepar(String nombreDepar) {
        this.nombreDepar = nombreDepar;
    }

    public ArrayList<Profesor> getProfes() {
        return Profes;
    }

    public void setProfes(ArrayList<Profesor> profes) {
        Profes = profes;
    }

    public ArrayList<Administrativo> getAdminis() {
        return Adminis;
    }

    public void setAdminis(ArrayList<Administrativo> adminis) {
        Adminis = adminis;
    }

    public ArrayList<CarreraUniversitaria> getCarreras() {
        return Carreras;
    }

    public void setCarreras(ArrayList<CarreraUniversitaria> carreras) {
        Carreras = carreras;
    }
}
