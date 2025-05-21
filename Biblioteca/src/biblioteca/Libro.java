package biblioteca;

public class Libro extends MaterialBiblioteca {
    private int isbn;

    public Libro(int isbn, String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.isbn = isbn;
    }
    
    @Override
    public String mostrarInfo(){
        return super.mostrarInfo() + "\nCodigo del libro: " + isbn;
    }
}
