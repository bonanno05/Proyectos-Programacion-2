
package proyectoInstituto;

import java.util.ArrayList;


public class Materia {
    private static int codigo=1000;
    private NombreDeMateria nombre;
    private double cargaHoraria;
    private int comision;
    private Docente docente;
    private ArrayList<Estudiante>alumnos;

    public Materia() {
        alumnos=new ArrayList<>();
    }

public void asignarDocente(Docente docente){
    this.docente=docente;
}
//Importante
public void asignarAlumno(Estudiante estudiante){
alumnos.add(estudiante);
        }
    public Materia(NombreDeMateria nombre, double cargaHoraria, int comision) {
        this.nombre = nombre;
        this.cargaHoraria = cargaHoraria;
        this.comision = comision;
        codigo+=1;
                alumnos=new ArrayList<>();

    }

    public NombreDeMateria getNombre() {
        return nombre;
    }

    public void mostrarAlumnosCursando() {
        for (Estudiante alumno : alumnos) {
            System.out.println(alumno.getNombreyApe());
        }
    }

    @Override
    public String toString() {
        return "Materia{" + "nombre=" + nombre + ", cargaHoraria=" + cargaHoraria + ", comision=" + comision +  '}';
    }

    public Docente getDocente() {
        return docente;
    }
    
    
    
}
