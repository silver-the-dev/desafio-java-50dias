public class Circulo extends FormaGeometrica{
    final static double PI = 3.1415926535897935897932384626433;
    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return PI * (raio * raio);
    }
}
