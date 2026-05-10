import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Primeiro");
        lista.add("Segundo");
        lista.add("Terceiro");
        lista.forEach((valor) -> System.out.println(valor));
    }
}
