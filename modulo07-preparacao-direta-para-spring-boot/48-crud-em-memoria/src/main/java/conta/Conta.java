package conta;

public class Conta {
    public int numDaConta;
    public double saldoDaConta;

    public Conta(int numDaConta, double saldoDaConta){
        this.numDaConta = numDaConta;
        this.saldoDaConta = saldoDaConta;
    }

    public int getNumDaConta() {
        return numDaConta;
    }
    public double getSaldoDaConta() {
        return saldoDaConta;
    }

}
