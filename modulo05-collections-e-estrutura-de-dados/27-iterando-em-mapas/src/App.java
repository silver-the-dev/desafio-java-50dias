import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, String> mapa = new HashMap<>();

        mapa.put("Apple", "Maçã");
        mapa.put("Pear", "Pera");
        mapa.put("Grape", "Uva");
        mapa.put("Pineapple", "Abacaxi");
        mapa.put("Melon", "Melancia");

        for(Map.Entry<String, String> entry : mapa.entrySet()){
            System.out.println("Chave: " + entry.getKey() + " | Valor: " + entry.getValue());
        }
    }
}
