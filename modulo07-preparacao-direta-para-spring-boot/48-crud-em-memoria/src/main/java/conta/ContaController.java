package conta;

import java.util.Random;
import java.util.Scanner;

public class ContaController {
    public Scanner scn;
    public ContaController(){
        scn = new Scanner(System.in);
    }

    public boolean sacar(){
        System.out.print("Digite o número da conta: ");
        String numDaConta = scn.nextLine();
        System.out.print("Digite o valor do saque: ");
        String valorDoSaque = scn.nextLine();
        try{
            return ContaService.sacarService(Integer.parseInt(numDaConta), valorDoSaque);
        } catch (Exception e){
            System.err.println("Erro ao sacar valor: " + e.getMessage());
            return false;
        }
    }

    public boolean criarConta(){
        int numDaConta = new Random(System.currentTimeMillis()).nextInt(999999);
        System.out.print("Saldo inicial da conta: ");
        String saldoInicial = scn.nextLine();
        Conta c = ContaService.criarContaService(numDaConta, Double.parseDouble(saldoInicial));
        if(c != null){
            System.out.println("Êxito ao criar a conta, num da conta é: " + c.getNumDaConta());
            return true;
        }
        return false;
    }
    public void retornarListaDeClientes(){
        ContaService.devolverClientes().forEach((conta) ->
                System.out.println("Conta: " + conta.getNumDaConta() + "\n\tSaldo: " + conta.getSaldoDaConta()));
    }

    public boolean depositar(){
        System.out.print("Digite o número da conta: ");
        int numDaConta = Integer.parseInt(scn.nextLine());
        System.out.print("Valor à depositar: ");
        double depositar = Double.parseDouble(scn.nextLine());
        try {
            return ContaService.depositarService(numDaConta, depositar);
        } catch (Exception e){
            System.err.println("Erro ao depositar valor: " + e.getMessage());
            return false;
        }
    }
}
