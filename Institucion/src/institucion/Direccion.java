package institucion;

public class Direccion {
    private final String calle;
    private final int numero;
    private final String ciudad;
    private final String codigoPostal;

    public Direccion(String calle, int numero, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }
    
    public String mostrarDireccion(){
        return "Calle: " + calle
                + "\nNumero: " + numero
                + "\nCiudad: " + ciudad
                + "\nCodigo Postal: " + codigoPostal;
    }
}
