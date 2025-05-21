package concesionaria;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Gerente extends Empleado {
    private double bono;
    
    Scanner input = new Scanner(System.in);
    
    public Gerente(double bono, String nombre, String apellido, int dni, String email) {
        super(nombre, apellido, dni, email);
        this.bono = bono;
    }

    public Gerente() {
    }
    
    public void agregarEmpleado(ArrayList<Administrativo> listaAdmin, ArrayList<Vendedor> listaVend){
        int op = 0, dni;
        String nom, ape, documento, email;
        do {
            System.out.println("Ingrese tipo de empleado: "
                            + "\n1. Administrativo."
                            + "\n2. Vendedor.");
            op = input.nextInt();
        } while (op < 1 || op > 2);
        
        
        switch(op){
            case 1:
                nom = JOptionPane.showInputDialog(null,"Ingrese su nombre: ");
                ape = JOptionPane.showInputDialog(null,"Ingrese su apellido: ");
                documento = JOptionPane.showInputDialog(null,"Ingrese su dni: ");
                dni = Integer.parseInt(documento);
                email = JOptionPane.showInputDialog(null,"Ingrese su mail: ");
                listaAdmin.add(new Administrativo(600000,nom,ape,dni,email));
                break;
            case 2:
                nom = JOptionPane.showInputDialog(null,"Ingrese su nombre: ");
                ape = JOptionPane.showInputDialog(null,"Ingrese su apellido: ");
                documento = JOptionPane.showInputDialog(null,"Ingrese su dni: ");
                dni = Integer.parseInt(documento);
                email = JOptionPane.showInputDialog(null,"Ingrese su mail: ");
                listaVend.add(new Vendedor(nom,ape,dni,email));
                break;
            default:
                break;
        }
    }
    
    @Override
    public double calcularSueldo(){
        return super.calcularSueldo() + bono;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSueldo final: " + calcularSueldo();
    }
    
    public void mostrarInfo(){
        System.out.println(toString());
    }
    
    
    
}
