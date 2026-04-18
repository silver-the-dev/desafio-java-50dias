public class Quadrado extends FormaGeometrica{
    double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }
}
