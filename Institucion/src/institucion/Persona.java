package institucion;



import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;
/**
 *
 * @author Tobias
 */

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fechaNacimiento;
    private String email;
    private Direccion direccion;

    public Persona(String nombre, String apellido, int dni, String email, String calle, int numero, String ciudad, String cp) {
        this.nombre = nombre; //el this sirve para referenciar a las variables gloables
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        direccion = new Direccion(calle, numero, ciudad, cp);
    }
    
    public Persona(){
        ingresarDatos();
    }
    
    public void ingresarDatos(){
        
        String documento, fechanac, calle, ciudad, cp,n;
        int numero;
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la persona: ");
        apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido de la persona: ");
        documento = JOptionPane.showInputDialog(null, "Ingrese el dni de la persona: ");
        dni = Integer.parseInt(documento);
        fechanac = JOptionPane.showInputDialog(null, "Ingrese su fecha de nacimiento (formato: YYYY-MM-DD): ");
        fechaNacimiento = LocalDate.parse(fechanac); 
        email = JOptionPane.showInputDialog(null, "Ingrese el mail de la persona: ");
        calle = JOptionPane.showInputDialog(null, "Ingrese la calle donde vive: ");
        n = JOptionPane.showInputDialog(null, "Ingrese el numero de altura donde vive: ");
        numero = Integer.parseInt(n);
        ciudad = JOptionPane.showInputDialog(null, "Ingrese la ciudad donde vive: ");
        cp = JOptionPane.showInputDialog(null, "Ingrese el codigo postal donde vive: ");
        direccion = new Direccion(calle,numero,ciudad,cp);
    }
    
    public int Edad(){
        if (fechaNacimiento == null) {
            return -1;
        }
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }
    
    public void mostrarInformacion(){
        int edad;
        System.out.println("Su nombre completo es " + nombre + " " + apellido );
        System.out.println("Su dni es " + dni);
        edad = Edad();
        if (edad != -1) {
            System.out.println("Usted tiene " + edad + " años");
        } else {
            System.out.println("No se pudo calcular la edad (fecha de nacimiento no valida)");
        }
        System.out.println("Su email es " + email);
        System.out.println("\n" + direccion.mostrarDireccion());
        
    }
    
    public void esMayorDeEdad(){
        LocalDate fechaActual = LocalDate.now();
        
        if (fechaNacimiento != null) {
            if (Period.between(fechaNacimiento, fechaActual).getYears() >= 18) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
        } else {
            System.out.println("No se pudo calcular si es mayor de edad (fecha de nacimiento no valida)");
        }
    }
        
}
