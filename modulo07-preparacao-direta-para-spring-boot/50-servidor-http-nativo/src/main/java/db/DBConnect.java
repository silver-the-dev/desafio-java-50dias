package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    static final String URL = "jdbc:sqlite:Banco.db";
    public static Connection getConnection(){
        try{
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(URL);
        } catch (SQLException e){
            System.err.println("Erro ao conectar no banco de dados");
        } catch (ClassNotFoundException e){
            System.err.println("Não foi possível encontrar a classe SQLite");
        }
        return null;
    }
}
