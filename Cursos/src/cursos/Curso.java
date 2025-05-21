package cursos;

public class Curso {
    private String nomCurso;
    private int duracion;

    public Curso(String nomCurso, int duracion) {
        this.nomCurso = nomCurso;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "\nCurso: " + nomCurso + 
                "\nDuracion: " + duracion + " meses";
    }
    
    
}
