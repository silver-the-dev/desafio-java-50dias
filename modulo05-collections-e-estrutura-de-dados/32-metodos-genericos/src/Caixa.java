import java.util.ArrayList;
import java.util.List;

public class Caixa<T> {
    public List<T> conteudo = new ArrayList<>();

    public void percorrerConteudo(List<T> lista) {
        lista.forEach(System.out::println);
    }
}
