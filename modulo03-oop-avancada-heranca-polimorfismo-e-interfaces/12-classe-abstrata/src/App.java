public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Raio do círculo = 5");
        System.out.println("Área do círculo = " + new Circulo(5).calcularArea());
        System.out.println("\n");
        System.out.println("Lado do quadrado = 5");
        System.out.println("Área do quadrado = " + new Quadrado(5).calcularArea());
    }
}
