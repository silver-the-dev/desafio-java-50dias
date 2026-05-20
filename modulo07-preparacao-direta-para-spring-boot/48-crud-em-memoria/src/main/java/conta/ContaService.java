package conta;

import java.util.ArrayList;
import java.util.Optional;

public class ContaService {

    public static boolean sacarService(int numDaConta, String valorDeSaque){
        try{
            Conta conta = ContaRepository.retornarCliente(numDaConta).orElseThrow();

            double saque = Double.parseDouble(valorDeSaque);

            if(saque > 0 && saque < conta.getSaldoDaConta()){
                conta.saldoDaConta -= saque;
                return true;
            }

        } catch (Exception e) {
            throw new RuntimeException("Não foi possível sacar" + e.getMessage());
        }
        return false;
    }

    public static Conta criarContaService(int numDaConta, double saldoInicial) {
        try{
            Conta conta = ContaRepository.retornarCliente(numDaConta).orElse(new Conta(-1, -1));
            while(numDaConta == conta.getNumDaConta()){
                numDaConta+=1;
            }

            Conta c = new Conta(numDaConta, saldoInicial);
            ContaRepository.clientes.add(c);
            return c;
        } catch (Exception e){
            throw new RuntimeException("Não foi possível criar uma nova conta" + e.getMessage());
        }
    }

    public static ArrayList<Conta> devolverClientes(){
        return ContaRepository.retornaListaDeClientes();
    }

    public static boolean depositarService(int numDaConta, double deposito) {
        try{
            Conta conta = ContaRepository.retornarCliente(numDaConta).orElseThrow();

            if(deposito > 0){
                conta.saldoDaConta += deposito;
            }
            return true;
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível depositar: " + e.getMessage());
        }
    }
}
