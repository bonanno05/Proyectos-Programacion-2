package tallermecanico;

public class Moto extends Vehiculo implements Reparable {

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }
    
    @Override
    public void reparar(){
        System.out.println("Reparando moto: " + this.toString() + " (Ajuste de cadena, revision de neumaticos)");
    }
}
