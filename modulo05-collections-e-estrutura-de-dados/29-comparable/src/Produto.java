import java.util.Collections;

public class Produto implements Comparable {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Produto))
            return -1;
        return this.nome.compareToIgnoreCase(((Produto) o).nome);
    }
}
