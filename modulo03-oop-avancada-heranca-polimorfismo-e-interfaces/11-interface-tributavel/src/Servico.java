public class Servico implements Tributavel{
    double valorNotaFiscal;

    public Servico(double valorNotaFiscal){
        this.valorNotaFiscal = valorNotaFiscal;
    }

    @Override
    public double calcularImposto() {
        return valorNotaFiscal * 0.05;
    }

    public double getValorNotaFiscal() {
        return valorNotaFiscal;
    }

    public void setValorNotaFiscal(double valorNotaFiscal) {
        this.valorNotaFiscal = valorNotaFiscal;
    }
}
