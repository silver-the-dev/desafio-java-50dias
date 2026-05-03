import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> mapa = new HashMap<>();

        mapa.put("Apple", "Maçã");
        mapa.put("Pear", "Pera");
        mapa.put("Grape", "Uva");
        mapa.put("Pineapple", "Abacaxi");
        mapa.put("Melon", "Melancia");

        mapa.forEach((ingles, portugues) -> {
            System.out.println("Inglês: " + ingles + " | Português: " + portugues);
        });   
    }
}
