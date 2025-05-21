package concesionaria;

import javax.swing.JOptionPane;

public class AutoUtilitario extends Auto {
    private int capacidadCargaKg;
    private boolean es4x4;
    private int cargaActual;
    private static int contadorUtilitarios = 0;

    public AutoUtilitario(int capacidadCargaKg, boolean es4x4, int puertas, String color, String marca, double cil, int hp) {
        super(puertas, color, marca, cil, hp);
        this.capacidadCargaKg = capacidadCargaKg;
        this.es4x4 = es4x4;
        cargaActual = 0;
        contadorUtilitarios++;
    }
    
    public void cargarMercaderia(int kg){
        if(kg <= capacidadCargaKg - cargaActual) {
            cargaActual += kg;
            System.out.println("Usted cargo " + kg +"kg." + 
                    "\nCarga disponible: " + (capacidadCargaKg-cargaActual));
        } else {
            System.out.println("Sobre carga de vehiculo" +
                    "\nCarga disponible: " + (capacidadCargaKg-cargaActual));
        }
    }
    
    public void es4x4() {
        if(es4x4) {
            System.out.println("Es 4x4 !!!");
        } else {
            System.out.println("No tiene traccion en las 4 ruedas.");
        }
    }
    
    @Override
    public void mostrarAuto() {
        super.mostrarAuto();
        System.out.println("La capacidad de carga es " + capacidadCargaKg + "kg" +
                "\nEs 4 x 4: "+es4x4);
    }
    
    @Override
    public void avanzar(int km) {
        JOptionPane.showMessageDialog(null, "El auto utilitario quiere avanzar");
        super.avanzar(km);
    }
    
    // Método sobrescrito para mostrar el total de autos utilitarios
    public static void autosVendidos() {
        System.out.println("Total autos utilitarios vendidos: " + contadorUtilitarios);
    }
   
}
