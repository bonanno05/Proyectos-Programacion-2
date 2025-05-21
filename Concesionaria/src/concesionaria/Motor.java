package concesionaria;

public class Motor {
    private final double cilindrada; //son private final porque no van a ser modificados
    private final int hp; //son private final porque no van a ser modificados
    private int kmRecorridos;

    //CONSTRUCTOR ---------
    public Motor(double cilindrada, int hp) {
        this.cilindrada = cilindrada;
        this.hp = hp;
        kmRecorridos = 0; //se inicializa en cero porque todo auto nuevo arranca en 0km
    }
    
    public boolean requiereCambioAceite(int km){
        if(kmRecorridos > 100000) {
            
            return true;
        }
        else{
            kmRecorridos += km;
            return false;
        }
    }
    
    public String mostrarMotor(){
        return "Cilindrada: " + cilindrada
                + "\nCaballos de fuerza: " + hp
                + "\nKilometros recorridos: " + kmRecorridos;
    }
}
