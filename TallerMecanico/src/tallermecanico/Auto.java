package tallermecanico;

public class Auto extends Vehiculo implements Reparable {

    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }
    
    @Override
    public void reparar(){
        System.out.println("Reparando auto: " + this.toString() + " (Cambio de aceite, revision de frenos)");
    }
}
