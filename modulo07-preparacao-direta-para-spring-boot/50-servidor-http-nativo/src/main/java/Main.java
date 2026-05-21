import com.sun.net.httpserver.HttpServer;
import conta.ContaController;
import db.DBConnect;
import http.ContaHttp;

import java.net.InetSocketAddress;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    static void main(String[] args) {
        ContaController controller = new ContaController();
        System.out.println(controller.criarConta() ? "Conta criada com sucesso" : "Falha ao criar a conta");
        System.out.println(controller.criarConta() ? "Conta criada com sucesso" : "Falha ao criar a conta");
        System.out.println(controller.criarConta() ? "Conta criada com sucesso" : "Falha ao criar a conta");
        System.out.println(controller.sacar() ? "Saque efetuado com sucesso" : "Erro ao realizar o saque");
        System.out.println(controller.sacar() ? "Saque efetuado com sucesso" : "Erro ao realizar o saque");
        System.out.println(controller.retornarListaDeClientes());
        System.out.println(controller.depositar() ? "Depósito efetuado com sucesso" : "Erro ao realizar depósito");
        System.out.println(controller.depositar() ? "Depósito efetuado com sucesso" : "Erro ao realizar depósito");
        System.out.println(controller.depositar() ? "Depósito efetuado com sucesso" : "Erro ao realizar depósito");
        System.out.println(controller.retornarListaDeClientes());
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
            ContaHttp contaHttp = new ContaHttp(controller.retornarListaDeClientes(), server);
            server.start();
        } catch (Exception e){
            System.err.println("Não foi possível iniciar o servidor");
        }
    }
}