package concesionaria;

import javax.swing.JOptionPane;

public class Auto {
    private int puertas;
    private String color;
    private String marca;
    private Motor motor;
    private static int contador = 0;

    public Auto(int puertas, String color, String marca, double cil, int hp) {
        this.puertas = puertas;
        this.color = color;
        this.marca = marca;
        motor = new Motor(cil, hp); //se usa el constructor motor dentro del constructor del auto
        contador++;
    }

    public Auto() {
        ingresarDatos();
        contador++;
    }
    
    private void ingresarDatos() {
        String puer, aux1, aux2;
        int hp;
        double cil;
        marca = JOptionPane.showInputDialog(null, "Ingrese la marca del auto: ");
        color = JOptionPane.showInputDialog(null, "Ingrese el color del auto: ");
        puer = JOptionPane.showInputDialog(null, "Ingrese la cantidad de puertas del auto: ");
        puertas = Integer.parseInt(puer); //como el showImputDialog solo lee strings, el Integer.parseInte convierte esa numero de string a un int
        aux1 = JOptionPane.showInputDialog(null, "Ingrese la cilindrada del auto: ");
        cil = Double.parseDouble(aux1);
        aux2 = JOptionPane.showInputDialog(null, "Ingrese los caballos del auto: ");
        hp = Integer.parseInt(aux2);
        motor = new Motor(cil, hp);
    }
    
    public void avanzar(int km) {
        if(motor.requiereCambioAceite(km) == true) {
            JOptionPane.showMessageDialog(null, "No puede avanzar "+ km + ", debe cambiar el aceite");
        } else {
            JOptionPane.showMessageDialog(null, "Usted avanzo " + km + " kilometros.\n");
        }
    }
    
    public void mostrarAuto() {
        System.out.println("Marca: " + marca + 
                "\nColor: " + color + 
                "\nCantidad de puertas : " + puertas +
                "\n" + motor.mostrarMotor());   
    }
    
    public static void autosVendidos() {
        System.out.println("Total autos vendidos: "+contador);
    }
}


    