public class App {
    public static void main(String[] args) throws Exception {
        Cliente cli = new Cliente("João", 23, "1234");
        System.out.println(cli.autenticar("2345"));
        System.out.println(cli.autenticar("1234"));
    }
}
