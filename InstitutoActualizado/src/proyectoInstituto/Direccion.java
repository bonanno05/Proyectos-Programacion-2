
package proyectoInstituto;

import java.util.Scanner;


public class Direccion {
   Scanner input=new Scanner(System.in);
private String ciudad;

private String calle;
private int numero;
private String codigoPostal;


    //Constructor manual.
    public Direccion(String ciudad, String calle, int numero, String codigoPostal) {
        this.ciudad = ciudad;
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
    }
    //Constructor que usa cargarDirecciones, que pide por consola los datos
    public Direccion() {
        cargarDireccion();
    }

private void cargarDireccion(){
    System.out.println("Ingresa la ciudad: ");
    this.ciudad= input.nextLine();
    System.out.println("Ingresa la calle: ");
    this.calle= input.nextLine();
    System.out.println("Ingresa el numero: ");
    this.numero= Integer.parseInt(input.nextLine());
    System.out.println("Ingresa el cod postal: ");
    this.codigoPostal=input.nextLine();
    
    
}

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", ciudad=" + ciudad + ", codigoPostal=" + codigoPostal + '}';
    }



}
