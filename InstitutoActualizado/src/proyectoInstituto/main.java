package proyectoInstituto;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        //----------Aca puedo testear individualmente el ingreso manual por persona--
//        Persona personas= new Persona();
//        personas.mostrarDatos();
//        
//        System.out.println("Su edad es "+ personas.obtenerEdad());
//        System.out.println("Es mayor de edad? "+ personas.esMayor());
        //----------------------------------------------------------   

        //   En el main, al crear una persona, crear también una dirección y asociarla al objeto Persona.
        Persona persona1 = new Persona("Juan", "Perez", 45100555, "juan@mail.com", "CABA", "AV CORD", 3466, "1427");
        //nombre, carga horario,comision
        Materia m1 = new Materia(NombreDeMateria.ALGEBRA, 6, 1);
        Materia m2 = new Materia(NombreDeMateria.PROGRAMACION, 8, 2);
        Materia m3 = new Materia(NombreDeMateria.HISTORIA, 4, 1);
        Materia m4 = new Materia(NombreDeMateria.SISTEMAS_DE_COMPUTACION, 7, 3);
        Materia m5 = new Materia(NombreDeMateria.INGLES, 5, 1);
        Materia m6 = new Materia(NombreDeMateria.FISICA, 6, 2);
        Materia m7 = new Materia(NombreDeMateria.MATEMATICA, 6, 1);
        Materia m8 = new Materia(NombreDeMateria.ECONOMIA, 4, 2);

        Docente p1 = new Docente("Osvaldo", "Pereira", 12452888, "osv@mail.com", "BSAS", "AV Lisboa", 3223, "1422");
        Docente p2 = new Docente("Laura", "Martínez", 20543678, "laura.martinez@mail.com", "Córdoba", "Av Colón", 1532, "5000");

        Docente p3 = new Docente("Julián", "Ríos", 18345612, "julian.rios@mail.com", "Mendoza", "Calle San Martín", 874, "5500");

        Estudiante e1 = new Estudiante("Tomás", "Ramírez", 26789452, "tomas.ramirez@mail.com", "Tucumán", "Av Sarmiento", 420, "4000");
Estudiante e2 = new Estudiante("Camila", "Gómez", 29546123, "camila.gomez@mail.com", "Buenos Aires", "Av Rivadavia", 1034, "1405");
Estudiante e3 = new Estudiante("Lucas", "Fernández", 31254876, "lucas.fernandez@mail.com", "Santa Fe", "Calle Urquiza", 221, "3000");
Estudiante e4 = new Estudiante("Martina", "López", 27894561, "martina.lopez@mail.com", "Córdoba", "Bv San Juan", 532, "5000");
Estudiante e5 = new Estudiante("Sofía", "Pérez", 30123456, "sofia.perez@mail.com", "Salta", "Mitre", 765, "4400");

        Administrativo administrativo = new Administrativo();

        ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
        ArrayList<Estudiante> alumnos = new ArrayList<Estudiante>();
        ArrayList<Docente> docentes = new ArrayList<Docente>();
        ArrayList<Materia> materias = new ArrayList<Materia>();
        //testing
        administrativo.cargarMateria(materias, m1);
        administrativo.cargarMateria(materias, m2);
        administrativo.cargarMateria(materias, m3);
        administrativo.cargarMateria(materias, m4);
        administrativo.cargarMateria(materias, m5);
        administrativo.cargarMateria(materias, m6);
        administrativo.cargarMateria(materias, m7);
        administrativo.cargarMateria(materias, m8);
        //Separo para guiarme
        administrativo.cargarDocente(docentes, p1);
        administrativo.asignarMateriaADocente(p1, m1);
        administrativo.asignarMateriaADocente(p1, m2);
        administrativo.asignarMateriaADocente(p1, m3);
        
        
        administrativo.cargarDocente(docentes, p2);
        administrativo.asignarMateriaADocente(p2, m4);
        administrativo.asignarMateriaADocente(p2, m5);
        administrativo.asignarMateriaADocente(p2, m6);
        
        administrativo.cargarDocente(docentes, p3);
        administrativo.asignarMateriaADocente(p3, m7);
        administrativo.asignarMateriaADocente(p3, m8);
        //ahora alumnos
       
administrativo.cargarAlumno(alumnos, e1);
administrativo.asignarMateriaAEstudiante(e1, m1);
administrativo.asignarMateriaAEstudiante(e1, m2);

administrativo.cargarAlumno(alumnos, e2);
administrativo.asignarMateriaAEstudiante(e2, m2);
administrativo.asignarMateriaAEstudiante(e2, m3);
administrativo.asignarMateriaAEstudiante(e2, m4);

administrativo.cargarAlumno(alumnos, e3);
administrativo.asignarMateriaAEstudiante(e3, m1);
administrativo.asignarMateriaAEstudiante(e3, m5);

administrativo.cargarAlumno(alumnos, e4);
administrativo.asignarMateriaAEstudiante(e4, m4);
administrativo.asignarMateriaAEstudiante(e4, m6);
administrativo.asignarMateriaAEstudiante(e4, m7);

administrativo.cargarAlumno(alumnos, e5);
administrativo.asignarMateriaAEstudiante(e5, m3);
administrativo.asignarMateriaAEstudiante(e5, m6);

//La clase Alumnos deberá tener un método que reciba la lista de materias y visualice en cuales de ellas está cursando -> alumnos.get(0).cursadas(materias); 
//La clase Docente deberá tener un método que reciba la lista de materias y visualice en cuales de ellas está dictando. ->docentes.get(0).dictadas(materias);


//Un objeto del tipo Docente podrá ver, en sus materias dictadas, la lista de los alumnos que participan de dicha clase. Desarrollar métodos en la clase Docente que permitan visualizar lo indicado.
//Un objeto del tipo Alumno podrá ver las materias que cursa y el docente a cargo de la misma. Desarrollar métodos en la clase Alumno que permitan visualizar lo indicado.--->>>

//Aca hace las pruebas que quieras cambiando indice, se puede hacer un ciclo para mostrar todo tambien.
alumnos.get(0).mostrarMateriasCursadas();
docentes.get(0).alumnosPorMateriaDictada();




        
        
        
    }
}
