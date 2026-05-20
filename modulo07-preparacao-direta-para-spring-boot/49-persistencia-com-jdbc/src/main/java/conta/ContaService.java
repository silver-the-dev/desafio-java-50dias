package conta;

import java.util.ArrayList;
import java.util.Optional;

public class ContaService {

    public static boolean sacarService(int numDaConta, double valorDeSaque){
        try{
            Conta conta = ContaRepository.retornarCliente(numDaConta).orElseThrow();
            double saldo = conta.getSaldoDaConta();

            if(valorDeSaque > 0 && valorDeSaque < conta.getSaldoDaConta()){
                saldo -= valorDeSaque;
                return ContaRepository.atualizarSaldo(numDaConta, saldo);
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

            Conta c = ContaRepository.criarConta(numDaConta, saldoInicial);
            if(c.numDaConta!=-1) {
                return c;
            } else {
                throw new Exception("Não foi possível acessar o banco de dados");
            }
        } catch (Exception e){
            throw new RuntimeException("Não foi possível criar uma nova conta: " + e.getMessage());
        }
    }

    public static ArrayList<Conta> devolverClientes(){
        return ContaRepository.listarClientes();
    }

    public static boolean depositarService(int numDaConta, double deposito) {
        try{
            Conta conta = ContaRepository.retornarCliente(numDaConta).orElseThrow();
            double saldo = conta.getSaldoDaConta();
            if(deposito > 0){
                saldo += deposito;
                return ContaRepository.atualizarSaldo(numDaConta, saldo);
            }
            return true;
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível depositar: " + e.getMessage());
        }
    }
}
