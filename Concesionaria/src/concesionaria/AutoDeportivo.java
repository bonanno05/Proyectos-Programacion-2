package concesionaria;

import javax.swing.JOptionPane;

public class AutoDeportivo extends Auto {
    private int velocidadMaxima;
    private boolean tieneTurbo;
    private static int contadorDeportivos = 0;

    public AutoDeportivo(int velocidadMaxima, boolean tieneTurbo, int puertas, String color, String marca, double cil, int hp) {
        super(puertas, color, marca, cil, hp); //invoca a la superclase "Auto" que hereda las puertas, color, marca, cill, hp
        this.velocidadMaxima = velocidadMaxima;
        this.tieneTurbo = tieneTurbo;
        contadorDeportivos++;
    }
    
    public void activarTurbo() {
        if(tieneTurbo) {
            System.out.println("TURBO ACTIVADO !!!");
        } else {
            System.out.println("No tiene turbo.");
        }
    }
    
    @Override //esto quiere describir que va a sobrescibir la informacion del metodo mostrarAuto
    public void mostrarAuto() {
        super.mostrarAuto(); //aca llama a la funcion mostrarAuto, que muestra los parametros, solo falta agregar los datos privados de autoDeportivo
        System.out.println("Velocidad maxima: " + velocidadMaxima +
                "\nTiene turbo: " + tieneTurbo);
    }
    
    @Override
    public void avanzar(int km) {
        JOptionPane.showMessageDialog(null, "El auto deportivo quiere avanzar");
        super.avanzar(km);
    }
    
    
    // Método sobrescrito para mostrar el total de autos deportivos
    public static void autosVendidos() {
        System.out.println("Total autos deportivos vendidos: " + contadorDeportivos);
    }
    
}
