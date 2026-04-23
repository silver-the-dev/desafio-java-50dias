public class Gerente implements Autenticavel{
    public String nome;
    public int idade;
    private String senha;
    public Gerente(String nome, int idade, String senha){
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
    }
    @Override
    public boolean autenticar(String senha) {
        if(senha.equals(this.senha)) return true;
        return false;
    }
}
