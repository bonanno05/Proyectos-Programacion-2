package tienda;

public class Main {

    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras();
        
        Producto televisor = new Electrodomestico("Televisor 55\"", 180000., "Samsung");
        Producto pantalon = new Ropa("Pantalon", 45000, "Louis Vuitton");
        
        carrito.agregarProducto(televisor
        );
        carrito.agregarProducto(pantalon);
        
        carrito.mostrarProductos();
        System.out.println("Total de la compra: $" + carrito.calcularTotal());
    }
    
}
