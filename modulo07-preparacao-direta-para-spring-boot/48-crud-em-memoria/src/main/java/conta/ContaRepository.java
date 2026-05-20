package conta;

import java.util.ArrayList;
import java.util.Optional;

public class ContaRepository {
    public static ArrayList<Conta> clientes = new ArrayList<>();

    public static Optional<Conta> retornarCliente(int numDaConta){
        return clientes.stream().filter(n -> numDaConta == n.getNumDaConta()).findFirst();
    }
    public static ArrayList<Conta> retornaListaDeClientes(){
        return clientes;
    }
}
