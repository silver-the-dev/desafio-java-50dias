public class Conta {
    private int _saldo;
    private String _titular;

    public Conta(int saldo, String titular){
        _saldo = saldo;
        _titular = titular;
    }

    public int getSaldo(){
        return _saldo;
    }

    public String getTitular(){
        return _titular;
    }

    public void depositar(int quantia){
        if(quantia > 0){
            _saldo += quantia;
        } else return;
    }
}
