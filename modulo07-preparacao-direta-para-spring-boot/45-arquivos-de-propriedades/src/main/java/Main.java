import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
    static void main(String[] args) {
        Properties prop = new Properties();

        try(InputStream input = new FileInputStream("config.properties")){
            prop.load(input);
            String world = prop.getProperty("hello");
            String pong = prop.getProperty("ping");

            System.out.println("Hello: " + world);
            System.out.println("Ping: " + pong);

        } catch (IOException e){
            System.err.println("Erro na leitura" + e.getMessage());
        }
    }
}
