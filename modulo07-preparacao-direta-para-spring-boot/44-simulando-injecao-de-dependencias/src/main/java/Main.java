public class Main {
    static void main(String[] args) {
        ClienteController cliente = new ClienteController(new EmailService());
        System.out.println(cliente.enviarEmail("Email enviado com sucesso"));
    }
}
