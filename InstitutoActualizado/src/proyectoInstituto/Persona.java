
package proyectoInstituto;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;
public class Persona {

private String nombre;
private String apellido;
private int dni;
//Date o localdate FechaNacimiento 
private LocalDate fechaDeNacimiento;
private String email;
private Direccion direccion;

Scanner input = new Scanner(System.in);


public Persona() {
    //ingresarDatos();
}

//Constructor manual
public Persona(String nombre, String apellido, int dni, String email,String ciudad, String calle, int numero, String codigoPostal) {
this.nombre = nombre;
this.apellido = apellido;
this.dni = dni;
this.email = email;
this.direccion=new Direccion( ciudad,  calle, numero,  codigoPostal);


}


public void mostrarDatos(){
System.out.println("Nombre: " + nombre);
System.out.println("Apellido: " + apellido);
System.out.println("DNI: " + dni);
System.out.println("EDAD " + obtenerEdad());
System.out.println("EMAIL: "+ email);
System.out.println("DIRECCION: "+ direccion);

}


public void ingresarDatos()
{
System.out.println("Ingresa el nombre de la persona: ");
this.nombre = input.nextLine();

System.out.println("Ingresa el apellido: ");
this.apellido = input.nextLine();

System.out.println("Ingresa el dni: ");
this.dni = Integer.parseInt(input.nextLine());
//Debo hacer un cambio usando formatter para poder ingresar la fecha en fomrato DD-MM-YYYY
System.out.println("Ingresa tu fecha de nacimiento en el Fromato YYYY-MM-DD");
this.fechaDeNacimiento=LocalDate.parse(input.nextLine());


System.out.println("Ingresa el mail: ");
this.email = input.nextLine();

this.direccion=new Direccion();



}

public int obtenerEdad(){
    //Este metodo nos da la fecha actual del sistema en formato YYYY-MM-DD
    LocalDate fechaActual=LocalDate.now();
    //Obtiene un entero que es la edad, resta dia mes y año.
    int edad=Period.between(this.fechaDeNacimiento,fechaActual).getYears();
    
    return edad;
}

public boolean esMayor(){
    int edad=obtenerEdad();
    return edad>18;
}

    public String getNombreyApe() {
        return nombre+" "+apellido;
    }

   



}

