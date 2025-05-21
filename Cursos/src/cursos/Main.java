package cursos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList();
        estudiantes.add(new Estudiante(01,new Curso("3ro A",3),"Tiago Peruggini", 52326016));
        estudiantes.add(new Estudiante(02,new Curso("5to C",3),"Nicolas Fernandez", 47455308));
        estudiantes.add(new Estudiante(03,new Curso("1ro D",3),"Zoe Rodriguez", 55647888));
        estudiantes.add(new Estudiante(04,new Curso("4to B",3),"Romina Gatti", 54532114));
        
        for(Estudiante e: estudiantes){
            e.mostrarInfo();
            System.out.println("-------------------");
        }
        
    }
    
}
