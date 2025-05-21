package tienda;

public class Electrodomestico extends Producto implements Vendible {

    public Electrodomestico(String nombreProd, double precioBase, String marca) {
        super(nombreProd, precioBase, marca);
    }

    @Override
    public double calcularPrecioFinal() {
        // 21 % de IVA para electrodomésticos
        return precioBase * 1.21;
    }
    
}
