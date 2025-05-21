package perros;

/**
 *
 * @author Tobias
 */
public class Universo {
    
    private static Perro dogoArgentino;
    private static Perro pastorIngles;
    
    public static void main(String[] args) {
        dogoArgentino = new Perro("Guau Guau!");
        pastorIngles= new Perro("Woof Woof!");
        
        dogoArgentino.ladrar();
        pastorIngles.ladrar();
        dogoArgentino.intensificarLadrido();
        pastorIngles.intensificarLadrido();
        dogoArgentino.ladridoFurioso();
        pastorIngles.ladridoFurioso();
    }
    
}
