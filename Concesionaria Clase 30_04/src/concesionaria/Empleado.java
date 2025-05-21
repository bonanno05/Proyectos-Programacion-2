package concesionaria;

public class Empleado {
    private String nombre;
    private String apellido;
    private int dni;
    private String email;
    private int codigoEmpleado;
    private double sueldoBasico;
    private static int cod = 1000;

    public Empleado(String nombre, String apellido, int dni, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        codigoEmpleado = cod;
        cod++;
        sueldoBasico = 500000;
    }
    
    public Empleado() {
        codigoEmpleado = cod;
        cod++;
        sueldoBasico = 500000;
    }
    
    public double calcularSueldo(){
        return sueldoBasico;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre 
                + "\nApellido: " + apellido 
                + "\nDni: " + dni 
                + "\nMail: " + email 
                + "\nCodigo de Empleado: " + codigoEmpleado 
                + "\nSueldo: " + sueldoBasico;
    }
    
    
    
    public void mostrarInformacion(){
        System.out.println(toString());
    }
}
