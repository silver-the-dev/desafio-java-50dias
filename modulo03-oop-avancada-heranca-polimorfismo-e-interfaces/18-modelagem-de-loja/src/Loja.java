import java.util.ArrayList;
import java.util.List;

public class Loja {

    public List<Produtos> produtos = new ArrayList<>();
    public void adicionarProduto(Produtos prod){
        produtos.add(prod);
    }
    public void listarProdutos(){
        produtos.forEach((x) -> System.out.println(x.descricao + ", " + x.quantidade));
    }
    public int contarProdutos(){
        int soma = 0;
        for (Produtos prod : produtos) {
            soma += prod.quantidade;
        }
        return soma;
    }

}
