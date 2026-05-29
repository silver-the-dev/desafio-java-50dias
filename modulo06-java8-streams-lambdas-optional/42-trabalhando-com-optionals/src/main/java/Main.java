import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Main {
    static ArrayList<Cliente> clientes = new ArrayList<>(Arrays.asList(
            new Cliente(1, "Júlio", 32),
            new Cliente(2, "Natanael", 43),
            new Cliente(3, "Vitor", 23),
            new Cliente(4, "Pedro", 34),
            new Cliente(5, "João", 38)
    ));
    static void main(String[] args) {

        Cliente cliente =
                buscaClientePorId(6).orElseThrow();
        System.out.println(cliente.getId() + ", " + cliente.getIdade() + ", " + cliente.getNome());

    }

    public static Optional<Cliente> buscaClientePorId(int id){
        return clientes.stream()
                .filter(cliente -> cliente.getId() == id).findFirst();
    }
}
