package tienda;

public abstract class Producto implements Vendible {
    protected String nombreProd;
    protected double precioBase;
    protected String marca;

    public Producto(String nombreProd, double precioBase, String marca) {
        this.nombreProd = nombreProd;
        this.precioBase = precioBase;
        this.marca = marca;
    }

    //GETTERS COMUNES
    public String getNombreProd() {
        return nombreProd;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getMarca() {
        return marca;
    }
    
    // Las subclases deben implementar calcularPrecioFinal() si o si
    
    
}
