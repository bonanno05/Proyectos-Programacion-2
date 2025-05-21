package biblioteca;

public class Revista extends MaterialBiblioteca {
    private int numEdicion;

    public Revista(int numEdicion, String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.numEdicion = numEdicion;
    }
    
    @Override
    public String mostrarInfo(){
        return super.mostrarInfo() + "\nNumero de edicion de la revista: " + numEdicion;
    }
}
