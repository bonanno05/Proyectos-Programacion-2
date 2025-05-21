package institucion;

import java.util.ArrayList;

public class Docente extends Persona {
    private int codDocente;
    private ArrayList<Materia> materiasDictadas;

    public Docente(int codDocente, ArrayList<Materia> materiasDictadas, String nombre, String apellido, int dni, String email, String calle, int numero, String ciudad, String cp) {
        super(nombre, apellido, dni, email, calle, numero, ciudad, cp);
        this.codDocente = codDocente;
        this.materiasDictadas = materiasDictadas;
    }
    
    
}
