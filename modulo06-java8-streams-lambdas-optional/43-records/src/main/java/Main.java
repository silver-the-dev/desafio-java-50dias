public class Main {
    static void main(String[] args) {
        ClienteDTO cliente = new ClienteDTO("Cleber", 12);
        ClienteDTO cliente2 = new ClienteDTO("Vitor", 34);

        System.out.println(cliente.nome());
        System.out.println(cliente2.nome());
        System.out.println(cliente.idade());
        System.out.println(cliente2.idade());
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(cliente.equals(cliente2));
    }
}
