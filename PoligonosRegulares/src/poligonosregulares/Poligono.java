package poligono;

public class Poligono {

    public static void main(String[] args) {
        Triangulo T = new Triangulo(4);
        Cuadrado C = new Cuadrado(5);
        T.area();
        T.perimetro();
        C.area();
        C.perimetro();
    }
}