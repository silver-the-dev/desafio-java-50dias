package conta;

import db.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

public class ContaRepository {
    // CREATE
    public static Conta criarConta(int numDaConta, double saldoDaConta){
        String sql = "INSERT INTO contas (numero, saldo) VALUES (?, ?)";

        try(Connection conn = DBConnect.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, numDaConta);
            stmt.setDouble(2, saldoDaConta);
            stmt.executeUpdate();
            return new Conta(numDaConta, saldoDaConta);
        } catch (SQLException e){
            System.err.println("Erro ao salvar a conta no banco de dados: " + e.getMessage());
        }
        return new Conta(-1, -1);
    }
    // READ
    public static ArrayList<Conta> listarClientes(){
        String sql = "SELECT * FROM contas";
        ArrayList<Conta> contasRecuperadas = new ArrayList<>();

        try(Connection conn = DBConnect.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                int numDaConta = rs.getInt("numero");
                double saldo = rs.getDouble("saldo");
                contasRecuperadas.add(new Conta(numDaConta, saldo));
            }
            return contasRecuperadas;
        } catch (SQLException e){
            System.err.println("Erro ao retornar cliente: " + e.getMessage());
            return null;
        }
    }
    public static Optional<Conta> retornarCliente(int numero){
        ArrayList<Conta> contas = listarClientes();
        for(Conta conta : contas){
            if(conta.numDaConta == numero){
                return Optional.of(conta);
            }
        } return Optional.empty();
    }

    // UPDATE
    public static boolean atualizarSaldo(int numDaConta, double saldo){
        String sql = "UPDATE contas SET numero = ?, saldo = ? WHERE numero = ?";

        try(Connection conn = DBConnect.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, numDaConta);
            stmt.setDouble(2, saldo);
            stmt.setInt(3, numDaConta);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e){
            System.err.println("Erro ao atualizar o saldo");
        }
        return false;
    }
}
