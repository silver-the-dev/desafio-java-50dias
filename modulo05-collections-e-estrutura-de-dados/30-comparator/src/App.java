import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Produto> prods = new ArrayList<>();

        prods.add(new Produto("Prod 5", 50));
        prods.add(new Produto("Prod 2", 20));
        prods.add(new Produto("Prod 4", 40));
        prods.add(new Produto("Prod 1", 10));
        prods.add(new Produto("Prod 3", 30));

        prods.sort(new ProdutoComparator());

        prods.forEach((prod) -> System.out.println(prod.preco));
    }
}
