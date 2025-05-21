package concesionaria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Auto> autos = new ArrayList();
        autos.add(new Auto(5, "Ford", "Blanco", 2.0, 185)); //hardcodeado
        autos.add(new Auto()); //usa el constructor vacio que llama a la funcion ingresarDatos()
    
        autos.get(0).avanzar(75000); //el autos.get(indice) es como un auto[indice] pero en un array
        autos.get(0).avanzar(60000);
        autos.get(0).avanzar(10);
        
        
        for(Auto car: autos) {
            car.mostrarAuto();
        }
        
        AutoDeportivo aDep = new AutoDeportivo(350, true, 5, "Naranja", "Lamborghini", 2.4, 240);
        aDep.avanzar(500);
        aDep.activarTurbo();
        aDep.mostrarAuto();
        
        AutoFamiliar aFar = new AutoFamiliar(7,5,"Negro","Chevrolet",1.6,110);
        aFar.avanzar(550);
        aFar.prepararViaje();
        aFar.mostrarAuto();
        
        
        AutoUtilitario aUti = new AutoUtilitario(1000,true,5,"Blanco","Ford",1.6,115);
        aUti.avanzar(600);
        aUti.es4x4();
        aUti.cargarMercaderia(800);
        aUti.cargarMercaderia(300); //la capacidad de carga es de 1000kg, asi que esos 300kg no van a poder ser cargados
        aUti.mostrarAuto();
        
        ArrayList<AutoDeportivo> autosVendidos = new ArrayList();
        autosVendidos.add(new AutoDeportivo(220, true, 4, "Rojo", "Ferrari", 3.9, 710));
        autosVendidos.add(new AutoDeportivo(180, false, 4, "Azul", "Toyota", 1.8, 140));
        autosVendidos.add(new AutoDeportivo(200, true, 2, "Negro", "Nissan", 2.0, 250));
        autosVendidos.add(new AutoDeportivo(240, true, 2, "Amarillo", "Lamborghini", 5.2, 770));
        autosVendidos.add(new AutoDeportivo(160, false, 4, "Gris", "Chevrolet", 2.4, 160));
        autosVendidos.add(new AutoDeportivo(210, false, 4, "Blanco", "BMW", 2.0, 190));
        autosVendidos.add(new AutoDeportivo(195, false, 4, "Verde", "Kia", 1.6, 130));
        autosVendidos.add(new AutoDeportivo(250, true, 2, "Naranja", "McLaren", 4.0, 800));
        autosVendidos.add(new AutoDeportivo(170, false, 4, "Plata", "Hyundai", 2.0, 150));
        autosVendidos.add(new AutoDeportivo(230, true, 4, "Azul Marino", "Audi", 3.0, 333));
        
        Auto.autosVendidos();
        AutoDeportivo.autosVendidos();
        AutoFamiliar.autosVendidos();
        AutoUtilitario.autosVendidos();

    }
    
}
