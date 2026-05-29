class Main {
    public static void main(String[] args) {
        StatusPedido stats = StatusPedido.PROCESSANDO;
        System.out.println("Antigo: " + stats);
        System.out.println("Tempo: " + stats.verificarPrazo());
        stats = stats.incrementar();
        System.out.println("Novo: " + stats);
        System.out.println("Tempo: " + stats.verificarPrazo());
        stats = stats.incrementar();
        System.out.println("Novo novo: " + stats);
        System.out.println("Tempo: " + stats.verificarPrazo());
    }
}