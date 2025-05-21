package tallermecanico;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Reparable> reparables = new ArrayList(); //Esto quiere decir que creamos un array de cualquier objeto que implemente la interfaz Reparable
        
        reparables.add(new Auto("Ford","Mustang"));
        reparables.add(new Moto("BMW","GS 1200"));
        reparables.add(new Auto("Chevrolet","Camaro"));
        reparables.add(new Auto("Ducati","1200"));
        
        for(Reparable r : reparables) {
            r.reparar();
        }
    }
    
}
