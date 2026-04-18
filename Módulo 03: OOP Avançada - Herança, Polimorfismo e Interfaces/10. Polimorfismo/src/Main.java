public class Main {
    public static void main(String[] args) throws Exception {
        Desenvolvedor dev = new Desenvolvedor("Jhonathan", 18, 2500.00, "Java");
        System.out.println("Salário antigo do Dev: " + dev.getSalario());
        System.out.println("Bônus do Dev: " + dev.calcularBonus());
        Gerente grnt = new Gerente("Pedro", 23, 3500.00, "Vendas");
        System.out.println("Salário antigo do Gerente: " + grnt.getSalario());
        System.out.println("Bônus do Gerente: " + grnt.calcularBonus());
    }
}
