package concesionaria;

import java.util.ArrayList;
import java.util.Scanner;

class Vendedor extends Empleado {
    private ArrayList<Auto> listaVendidos;
    Scanner input = new Scanner(System.in);
    
    public Vendedor(String nombre, String apellido, int dni, String email) {
        super(nombre, apellido, dni, email);
        listaVendidos = new ArrayList();
    }

    public Vendedor() {
        listaVendidos = new ArrayList();
    }
    
    public void venderAuto(ArrayList<Auto> stock, ArrayList<Auto> vendidos){
        int op;
        for(Auto auto: stock){
            System.out.println(stock.indexOf(auto)); //muestra el indice en el que se encuentra este objeto
            auto.mostrarAuto();
            System.out.println("========================");
        }
        do{
            System.out.print("Ingrese numero de auto: ");
            op = input.nextInt();
        } while (op < 0 || op > stock.size());
        
        vendidos.add(stock.get(op));
        listaVendidos.add(stock.get(op));
        stock.remove(op);
    } 
    
    @Override
    public double calcularSueldo(){
        int comision = 0;
        for(Auto auto: listaVendidos){
            comision += (auto.getPrecio() * 0.03);
        }
        return super.calcularSueldo() + comision;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nSueldo final: " + calcularSueldo();
    }
    
    public void mostrarInfo(){
        System.out.println(toString());
    }
}
