public class Main {
    static void main() {
        StatusPedido stats = StatusPedido.PROCESSANDO;
        System.out.println("Antigo: " + stats);
        stats = stats.incrementar();
        System.out.println("Novo: " + stats);
        stats = stats.incrementar();
        System.out.println("Novo novo: " + stats);
    }
}