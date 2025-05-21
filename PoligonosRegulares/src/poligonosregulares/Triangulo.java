package poligono;

public class Triangulo extends PoligonoRegular{

    public Triangulo(int lado) {
        super(lado);
    }

    @Override
    public void area() {
        double area = super.getLado() * super.getLado() * Math.sqrt(3)/4;
        System.out.println("Area: " + area);
    }

    @Override
    public void perimetro() {
        System.out.println("Perimetro: " + super.getLado() * 3);
    }
    
}
