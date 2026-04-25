public class App {
    public static void main(String[] args){
        Pessoa pes1 = new Pessoa("João", 2);
        Pessoa pes2 = new Pessoa("João", 2);

        System.out.println("Pessoas: " + pes1.equals(pes2));
        System.out.println(pes1.equals(new Calculadora("Marca")));
    }
}
