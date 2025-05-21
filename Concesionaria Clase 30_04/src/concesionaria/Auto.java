package concesionaria;

import javax.swing.JOptionPane;

public class Auto {
    private String codAuto;
    private String marca;
    private String modelo;
    private String color;
    private double precio;
    private Motor motor;
    private static int contador = 0;

    public Auto(String codAuto, String marca, String modelo,String color,double precio, double cil, int hp) {
        this.codAuto = codAuto;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        motor = new Motor(cil, hp); //se usa el constructor motor dentro del constructor del auto
        contador++;
    }

    public Auto() {
        ingresarDatos();
        contador++;
    }

    public double getPrecio() { //esta funcion obtiene el precio de un respectivo auto
        return precio;
    }
    
    
    
    private static void autosVendidos(){
        System.out.println("Total autos vendidos: " + contador);
    }
    
    
    private void ingresarDatos() {
        String prec,aux1, aux2;
        int hp;
        double cil;
        codAuto = JOptionPane.showInputDialog(null, "Ingrese el codigo del auto: ");
        marca = JOptionPane.showInputDialog(null, "Ingrese la marca del auto: ");
        modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo del auto: ");
        color = JOptionPane.showInputDialog(null, "Ingrese el color del auto: ");
        prec = JOptionPane.showInputDialog(null, "Ingrese el precio del auto: ");
        precio = Double.parseDouble(prec);
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

    @Override
    public String toString() {
        return "Codigo del auto: " + 
                codAuto + "\nMarca: " +
                marca +"\nModelo: " +
                modelo + "\nColor: " +
                color + "\nPrecio: "+ 
                precio + motor.toString();
    }
    
    public void mostrarAuto() {
        System.out.println(toString());    
    }
}    