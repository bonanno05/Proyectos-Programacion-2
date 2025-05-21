package poligono;

public abstract class PoligonoRegular {
    private int lado;

    public PoligonoRegular(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }
    
    public abstract void area();
    public abstract void perimetro();
    
}
