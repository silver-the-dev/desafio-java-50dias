public class App {
    public static void main(String[] args) throws Exception {
        Loja loja = new Loja();
        loja.adicionarProduto(new Eletronico("Computador", 10));
        loja.adicionarProduto(new Eletronico("Celular", 15));
        loja.adicionarProduto(new Alimento("Maçã", 12));
        loja.listarProdutos();
        System.out.println("Quantidade de produtos: " + loja.contarProdutos());
    }
}
