public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Pessoa)) return false;
        if(this == obj) return true;
        if(this.nome == ((Pessoa)obj).nome && this.idade == ((Pessoa)obj).idade)
            return true;
        return false;
    }
}
