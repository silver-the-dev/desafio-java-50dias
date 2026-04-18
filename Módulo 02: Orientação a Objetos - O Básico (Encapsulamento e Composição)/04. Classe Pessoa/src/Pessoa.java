public class Pessoa {
    private String _nome;
    private int _idade;

    public Pessoa(String nome, int idade){
        _nome = nome;
        _idade = idade;
    }

    public int getIdade(){
        return _idade;
    }
    public void setIdade(int value){
        if(value < 0){
            return;
        } _idade = value;
    }
    public String getNome(){
        return _nome;
    }
    public void setNome(String value){
        _nome = value;
    }
}
