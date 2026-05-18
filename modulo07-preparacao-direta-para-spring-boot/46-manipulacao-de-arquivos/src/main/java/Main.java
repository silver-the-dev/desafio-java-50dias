import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        ArrayList<Usuario> usrs = new ArrayList<>(
                Arrays.asList(
                    new Usuario("João"),
                    new Usuario("Amanda"),
                    new Usuario("Pedro"),
                    new Usuario("Júlio"),
                    new Usuario("Matheus")
                )
        );

        // Escrita
        try(FileWriter writer = new FileWriter("text.txt")){
            for(Usuario usr : usrs){
                writer.write(usr.getNomeDoUsuario() + "\n");
            }
        } catch (IOException e){
            System.err.println(e.getMessage());
        }

        // Leitura
        try(BufferedReader read = new BufferedReader(new FileReader("text.txt"))){
            String line;
            while((line = read.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
