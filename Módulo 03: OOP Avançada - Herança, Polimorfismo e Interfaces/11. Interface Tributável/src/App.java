public class App {
    public static void main(String[] args) throws Exception {
        Servico serv = new Servico(31.5);
        System.out.println("---===]]] Serviço [[[===---");
        System.out.println("Sem imposto: " + serv.getValorNotaFiscal());
        serv.setValorNotaFiscal(serv.getValorNotaFiscal() + serv.calcularImposto());
        System.out.println("Com imposto: " + serv.getValorNotaFiscal());
        Produto prod = new Produto(39.90);
        System.out.println("---===]]] Produto [[[===---");
        System.out.println("Sem imposto: " + prod.getValorDoProduto());
        prod.setValorDoProduto(prod.getValorDoProduto() + prod.calcularImposto());
        System.out.println("Com imposto: " + prod.getValorDoProduto());
    }
}
