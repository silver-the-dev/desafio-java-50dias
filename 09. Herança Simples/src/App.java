public class App {
    public static void main(String[] args) throws Exception {
        Desenvolvedor dev = new Desenvolvedor("Jhonathan", 18, 2500.00, "Java");
        System.out.println(dev.getNome());
        Gerente grnt = new Gerente("Pedro", 23, 3500, "Vendas");
        System.out.println(grnt.getNome());
    }
}
