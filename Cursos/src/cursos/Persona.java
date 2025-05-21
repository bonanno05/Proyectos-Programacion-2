package cursos;

public class Persona {
    private String nomApe;
    private int dni;

    public Persona(String nomApe, int dni) {
        this.nomApe = nomApe;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nombre: " + nomApe +
                "\nDni: " + dni;
    }
    
    
    
}
