import conta.ContaController;

public class Main {
    static void main(String[] args) {
        ContaController controller = new ContaController();
        System.out.println(controller.criarConta() ? "Conta criada com sucesso" : "Falha ao criar a conta");
        System.out.println(controller.criarConta() ? "Conta criada com sucesso" : "Falha ao criar a conta");
        System.out.println(controller.criarConta() ? "Conta criada com sucesso" : "Falha ao criar a conta");
        System.out.println(controller.sacar() ? "Saque efetuado com sucesso" : "Erro ao realizar o saque");
        System.out.println(controller.sacar() ? "Saque efetuado com sucesso" : "Erro ao realizar o saque");
        controller.retornarListaDeClientes();
        System.out.println(controller.depositar() ? "Depósito efetuado com sucesso" : "Erro ao realizar depósito");
        System.out.println(controller.depositar() ? "Depósito efetuado com sucesso" : "Erro ao realizar depósito");
        System.out.println(controller.depositar() ? "Depósito efetuado com sucesso" : "Erro ao realizar depósito");
        controller.retornarListaDeClientes();
    }
}
