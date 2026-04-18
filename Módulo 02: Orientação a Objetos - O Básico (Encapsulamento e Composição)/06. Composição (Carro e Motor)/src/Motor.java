public class Motor {
    private int _cavalos;
    private String _tipo;

    public Motor(int cavalos, String tipo){
        this._cavalos = cavalos;
        this._tipo = tipo;
    }

    public int getCavalos(){
        return _cavalos;
    }
    public String getTipo(){
        return _tipo;
    }
    public void setCavalos(int value){
        if(_cavalos > 0){
            _cavalos = value;
        }
    }
    public void setTipo(String value){
        _tipo = value;
    }
}
