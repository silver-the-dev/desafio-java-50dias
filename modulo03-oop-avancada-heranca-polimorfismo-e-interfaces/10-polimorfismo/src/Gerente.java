public class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, int idade, double salario, String setor){
        super(nome, idade, salario);
        this.setor = setor;
    }
    @Override
    public double calcularBonus() {
        return (getSalario() * 0.2) + getSalario();
    }
}
