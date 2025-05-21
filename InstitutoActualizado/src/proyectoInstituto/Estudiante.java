
package proyectoInstituto;

import java.util.ArrayList;
public class Estudiante extends Persona {
private ArrayList<Materia> materiasCursadas;

    public Estudiante() {
        materiasCursadas=new ArrayList<>();
    }
    public Estudiante(String nombre, String apellido, int dni, String email, String ciudad, String calle, int numero, String codigoPostal) {
        super(nombre, apellido, dni, email, ciudad, calle, numero, codigoPostal);
    materiasCursadas=new ArrayList<>();
    }


public void cursadas(ArrayList<Materia> listaDeMaterias){
    int i =0;
    //Aca recorro la lista de materias enviadas completas
    for (Materia materia : listaDeMaterias) {
        //Por cada materia, miro si cursa. Si en algun momento se encuentra con que cursa corta el ciclo.
        while(i<materiasCursadas.size() && !(materia.equals(materiasCursadas.get(i))) )
        { i++;
        }
        //si i<...es porque corto antes ya que encontro que si cursa
        if(i<materiasCursadas.size()){
            System.out.println("Cursa: "+materia.getNombre());
        }
    }
    
}
public void asignarMateria(Materia materia){
   materiasCursadas.add(materia);
}
public void mostrarMateriasCursadas(){
    System.out.println(this.getNombreyApe());
    for (Materia materia : materiasCursadas) {
        System.out.println("Materias cursadas: "+materia.getNombre() +" Docente a cargo: "+materia.getDocente().getNombreyApe());
    }
}

    @Override
    public String toString() {
        return "Estudiante{" + "materiasCursadas=" + materiasCursadas + '}';
    }

}
