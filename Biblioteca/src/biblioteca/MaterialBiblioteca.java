package biblioteca;

public class MaterialBiblioteca {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public MaterialBiblioteca(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo +
                "\nAutor: " + autor +
                "\nAño de publicacion: " + anioPublicacion;
    }
    
    public String mostrarInfo(){
        return toString();
    }
    
}
