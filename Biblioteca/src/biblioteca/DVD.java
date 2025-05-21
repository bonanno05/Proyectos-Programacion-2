package biblioteca;

public class DVD extends MaterialBiblioteca {
    private int duracionDVD;

    public DVD(int duracionDVD, String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.duracionDVD = duracionDVD;
    }
    
    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + "\nDuracion del DVD [en minutos]: " + duracionDVD;
    }
}
