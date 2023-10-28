public class Alumno {
    private int numeroControl;
    private String nombreAlumno;
    private int semestre;

    public Alumno(int numeroControl, String nombreAlumno, int semestre) {
        this.numeroControl = numeroControl;
        this.nombreAlumno = nombreAlumno;
        this.semestre = semestre;
    }

    public int getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(int numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
