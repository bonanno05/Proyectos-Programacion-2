package biblioteca;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<MaterialBiblioteca> materiales = new ArrayList();
        
        materiales.add(new Libro(01,"Harry Potter", "J. K. Rowling", 1997));
        materiales.add(new Revista(10002,"Tiki-Tiki", "Diario Ole", 2015));
        materiales.add(new DVD(45,"Un verano sin ti","Bad Bunny",2022));
        
        for(MaterialBiblioteca material: materiales){
            System.out.println(material.mostrarInfo());
            System.out.println("---------------------");
        }
    }
    
}
