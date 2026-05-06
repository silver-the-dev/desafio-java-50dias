import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Produto pr1 = new Produto("Sabão", 20);
        Produto pr2 = new Produto("Sabonete", 10);
        Produto pr3 = new Produto("Jogo", 30);
        Produto pr4 = new Produto("Videogame", 90);
        Produto pr5 = new Produto("Computador", 50);
        Produto pr6 = new Produto("Aviãozinho", 40);

        List<Produto> lista = new ArrayList<>();
        lista.add(pr1);
        lista.add(pr2);
        lista.add(pr3);
        lista.add(pr4);
        lista.add(pr5);
        lista.add(pr6);

        Collections.sort(lista);
        lista.forEach((valor) -> System.out.println(valor.nome));
    }
}
