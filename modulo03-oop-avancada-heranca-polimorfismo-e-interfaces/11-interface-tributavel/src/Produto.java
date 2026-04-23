public class Produto implements Tributavel{
    private double valorDoProduto;

    public Produto(double valorDoProduto){
        this.valorDoProduto = valorDoProduto;
    }

    @Override
    public double calcularImposto() {
        return valorDoProduto * 0.4;
    }

    public double getValorDoProduto() {
        return valorDoProduto;
    }
    
    public void setValorDoProduto(double valorDoProduto) {
        this.valorDoProduto = valorDoProduto;
    }
}
