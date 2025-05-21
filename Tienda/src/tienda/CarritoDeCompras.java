package tienda;

import java.util.ArrayList;

public class CarritoDeCompras {
    private ArrayList<Producto> productos = new ArrayList();

    public CarritoDeCompras() {
        this.productos = new ArrayList();
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public double calcularTotal(){
        double total = 0;
        for(Producto p: productos){
            total += p.calcularPrecioFinal();
        }
        return total;
    }
    
    public void mostrarProductos(){
        for(Producto p: productos){
            System.out.println(p.getNombreProd() + " (" + p.getMarca() + "): $" + p.calcularPrecioFinal());
        }
    }
}
