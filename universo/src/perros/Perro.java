package perros;

/**
 *
 * @author Tobias
 */
public class Perro {
    private String ladrido;
    
    public Perro(String s){
        ladrido = s;
    }
    
    public void ladrar() {
        System.out.println(ladrido);
    }
    
    public void intensificarLadrido() {
        System.out.println(ladrido + "!!!!!!!!");
    }
    
    public void ladridoFurioso() {
        System.out.println(ladrido + "!!@#&*");
    }
}
