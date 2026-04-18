public class Desenvolvedor extends Funcionario{
    private String nome;
    private int idade;
    private double salario;
    private String linguagem;

    public Desenvolvedor(String nome, int idade, double salario, String linguagem){
        super(nome, idade, salario);
        this.linguagem = linguagem;
    }
}
