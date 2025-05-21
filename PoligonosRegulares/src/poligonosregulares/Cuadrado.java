package poligono;

public class Cuadrado extends PoligonoRegular {

    public Cuadrado(int lado) {
        super(lado);
    }

    @Override
    public void area() {
        System.out.println("Area: " + super.getLado() * super.getLado());
    }

    @Override
    public void perimetro() {
        System.out.println("Perimtetro: " + super.getLado() * 4);
    }
    
}
