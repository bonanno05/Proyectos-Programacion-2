package concesionaria;

import javax.swing.JOptionPane;

public class AutoFamiliar extends Auto {
    private int capacidadPasajeros;
    private static int contadorFamiliares=0;

    public AutoFamiliar(int capacidadPasajeros, int puertas, String color, String marca, double cil, int hp) {
        super(puertas, color, marca, cil, hp);
        this.capacidadPasajeros = capacidadPasajeros;
        contadorFamiliares++;
    }
    
    public void prepararViaje() {
        System.out.println("Viaje preparado...");
    }
    
    @Override
    public void mostrarAuto() {
        super.mostrarAuto();
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
    }
    
    @Override
    public void avanzar(int km) {
        JOptionPane.showMessageDialog(null, "El auto familiar quiere avanzar");
        super.avanzar(km);
    }
    
    // Método sobrescrito para mostrar el total de autos familiares
    public static void autosVendidos() {
        System.out.println("Total autos familiares vendidos: " + contadorFamiliares);
    }
}
