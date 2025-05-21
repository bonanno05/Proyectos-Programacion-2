
package proyectoInstituto;

import java.util.ArrayList;


public class Docente extends Persona {
private ArrayList<Materia> materiasDictadas;

    public Docente() {
        materiasDictadas=new ArrayList<>();
    }

    public Docente(String nombre, String apellido, int dni, String email, String ciudad, String calle, int numero, String codigoPostal) {
        super(nombre, apellido, dni, email, ciudad, calle, numero, codigoPostal);
                materiasDictadas=new ArrayList<>();
                
    }
public void asignarMateria(Materia materia){
   materiasDictadas.add(materia);
   materia.asignarDocente(this);
}


public void dictadas(ArrayList<Materia> listaDeMaterias){
    int i =0;
    //Aca recorro la lista de materias enviadas completas
            System.out.println("El profe "+ this.getNombreyApe()+" dicta: ");
    for (Materia materia : listaDeMaterias) {
        //Por cada materia, miro si cursa. Si en algun momento se encuentra con que cursa corta el ciclo.
        while(i<materiasDictadas.size() && !(materia.equals(materiasDictadas.get(i))) )
        { i++;
        }
        //si i<...es porque corto antes ya que encontro que si cursa
        if(i<materiasDictadas.size()){
            System.out.println(materia.getNombre());
        }
    }
    
}
public void alumnosPorMateriaDictada(){
    System.out.println("El docente: "+this.getNombreyApe()+" dicta: ");
    for (Materia materiaDictada : materiasDictadas) {
        System.out.println("La "+ materiaDictada+" cursan:");
        materiaDictada.mostrarAlumnosCursando();
    }
}
public void mostrarMateriasCursadas(){
    for (Materia materia : materiasDictadas) {
        System.out.println("Materias dictadas: "+materia.getNombre());
    }
}

    @Override
    public String toString() {
        return "Docente{" + "materiasDictadas=" + materiasDictadas + '}';
    }

    

    

}
