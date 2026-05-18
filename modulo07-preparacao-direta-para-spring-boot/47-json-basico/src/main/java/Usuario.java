public class Usuario {
    public String nome;
    public String email;
    public int idade;
    public boolean ehDev;

    public Usuario(String nome, String email, int idade, boolean ehDev){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.ehDev = ehDev;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public boolean getEhDev() {
        return ehDev;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + getNome() + "\n");
        sb.append("Idade: " + getIdade() + "\n");
        sb.append("Email: " + getEmail() + "\n");
        sb.append("É Dev?: " + (getEhDev() ? "Sim" : "Não" )+ "\n");
        return sb.toString();
    }
}
