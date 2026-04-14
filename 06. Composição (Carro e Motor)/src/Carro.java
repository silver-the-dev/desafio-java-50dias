public class Carro {
    private String _marca;
    private String _modelo;
    private int _anoFabricacao;
    private Motor _motor;

    public Carro(String marca, String modelo, int anoFabricacao, Motor motor){
        this._marca = marca;
        this._modelo = modelo;
        this._anoFabricacao = anoFabricacao;
        this._motor = motor;
    }

    public String getMarca() {
        return _marca;
    }

    public void setMarca(String _marca) {
        this._marca = _marca;
    }

    public String getModelo() {
        return _modelo;
    }

    public void setModelo(String _modelo) {
        this._modelo = _modelo;
    }

    public int getAnoFabricacao() {
        return _anoFabricacao;
    }

    public void setAnoFabricacao(int _anoFabricacao) {
        this._anoFabricacao = _anoFabricacao;
    }

    public Motor getMotor() {
        return _motor;
    }

    public void setMotor(Motor _motor) {
        this._motor = _motor;
    }
}
