import java.util.LinkedHashSet;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedHashSet<String> list = new LinkedHashSet<>();

        list.add("Beringela");
        list.add("Maçã");
        list.add("Banana");
        list.add("Beringela");
        list.add("Pão");
        list.add("Banana");

        System.out.println("Lista do mercado: ");
        list.forEach(System.out::println);
    }
}
