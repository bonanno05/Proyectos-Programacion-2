
package proyectoInstituto;

import java.util.ArrayList;


public class Administrativo extends Persona {

    public Administrativo() {
    }

    public Administrativo(String nombre, String apellido, int dni, String email, String ciudad, String calle, int numero, String codigoPostal) {
        super(nombre, apellido, dni, email, ciudad, calle, numero, codigoPostal);
    }
public void cargarAlumno(ArrayList<Estudiante> estudiantes, Estudiante estudiante){
    estudiantes.add(estudiante);
    
}
public void cargarDocente(ArrayList<Docente> docentes,Docente docente){
    docentes.add(docente);
}
public void cargarMateria(ArrayList<Materia> materias,Materia materia){
    materias.add(materia);
   
    
}
   public void asignarMateriaADocente(Docente docente,Materia materia){
        docente.asignarMateria(materia);
    } 
    public void asignarMateriaAEstudiante(Estudiante estudiante,Materia materia){
        estudiante.asignarMateria(materia);
        materia.asignarAlumno(estudiante);
    } 
    
    
}
