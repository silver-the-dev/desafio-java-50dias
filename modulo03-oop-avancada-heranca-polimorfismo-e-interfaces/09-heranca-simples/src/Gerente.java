public class Gerente extends Funcionario {
    private String nome;
    private int idade;
    private double salario;
    private String setor;

    public Gerente(String nome, int idade, double salario, String setor){
        super(nome, idade, salario);
        this.setor = setor;
    }
}
