package institucion;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tobias
 */

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Persona> persona = new ArrayList();
        //persona.add(new Persona("Tobias","Bonanno",47127295,"bonanno05@gmail.com"));
        //persona.add(new Persona("Franco","Juarez",45236842,"juarez03@gmail.com"));
        persona.add(new Persona());
        
        for(Persona aux: persona){
            aux.mostrarInformacion();
            aux.esMayorDeEdad();
        }
        
        /*ArrayList<Materia> materias = new ArrayList();
        materias.add(new Materia(1,"Matematica",4));
        materias.add(new Materia(2, "Fisica", 5));
        materias.add(new Materia(3, "Quimica", 4));
        materias.add(new Materia(4, "Programacion", 6));
        materias.add(new Materia(5, "Historia", 3));
        materias.add(new Materia(6, "Ingles", 3));
        materias.add(new Materia(7, "Economia", 4));
        materias.add(new Materia(8, "Geografia", 3));
        materias.add(new Materia(9, "Literatura", 4));
        materias.add(new Materia(10, "Arte", 3));*/
        
        

        
    }
    
}
