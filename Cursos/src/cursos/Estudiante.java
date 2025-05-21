package cursos;

public class Estudiante extends Persona {
    private int legajo;
    private Curso curso;

    public Estudiante(int legajo, Curso curso, String nomApe, int dni) {
        super(nomApe, dni);
        this.legajo = legajo;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLegajo: " + legajo +
                curso.toString();
    }
    
    public void mostrarInfo(){
        System.out.println(this.toString());
    }

    
    
    
}
