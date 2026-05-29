import java.util.Comparator;

public class ProdutoComparator implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
        if (p1.preco > p2.preco)
            return -1;
        else
            return 1;
    }
}
