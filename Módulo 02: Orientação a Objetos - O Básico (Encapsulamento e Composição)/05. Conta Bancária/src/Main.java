public class Main {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta(0, "Trouxa");
        System.out.println("Quantia: ");
        conta.depositar(500);
        conta.depositar(30);
        conta.depositar(-30);

        System.out.println(conta.getSaldo());
    }
}
