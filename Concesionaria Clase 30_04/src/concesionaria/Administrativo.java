package concesionaria;

import java.util.ArrayList;


class Administrativo extends Empleado {
    private double adicional;

    public Administrativo(double adicional, String nombre, String apellido, int dni, String email) {
        super(nombre, apellido, dni, email);
        this.adicional = adicional;
    }

    public Administrativo() {
    }
    
    public void cargarAuto(ArrayList<Auto> stock){
        stock.add(new Auto());
    }
    
    /*public void cargarAuto(ArrayList<Auto> stock, Auto auto){
        stock.add(auto);
    }*/
    
    @Override
    public double calcularSueldo(){
        return super.calcularSueldo() + adicional;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nSueldo final: " + calcularSueldo();
    }
    
    public void mostrarInfo(){
        System.out.println(toString());
    }
}
