package tienda;

public class Ropa extends Producto implements Vendible {

    public Ropa(String nombreProd, double precioBase, String marca) {
        super(nombreProd, precioBase, marca);
    }

    @Override
    public double calcularPrecioFinal() {
        // 10% de descuento en ropa
        return precioBase * 0.90;
    }
    
    
}
