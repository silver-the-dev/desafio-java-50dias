public class Desenvolvedor extends Funcionario{
    private String linguagem;

    public Desenvolvedor(String nome, int idade, double salario, String linguagem){
        super(nome, idade, salario);
        this.linguagem = linguagem;
    }
    @Override
    public double calcularBonus() {
        return ((getSalario() * 0.1) + getSalario());
    }
}
