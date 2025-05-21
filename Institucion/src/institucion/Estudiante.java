package institucion;

import java.util.ArrayList;

public class Estudiante extends Persona {
    private int codEstudiante;
    private ArrayList<Materia> materiasCursadas;

    public Estudiante(int codEstudiante, ArrayList<Materia> materiasCursadas, String nombre, String apellido, int dni, String email, String calle, int numero, String ciudad, String cp) {
        super(nombre, apellido, dni, email, calle, numero, ciudad, cp);
        this.codEstudiante = codEstudiante;
        this.materiasCursadas = materiasCursadas;
    }
    
    
}
