public class App {
    public static void main(String[] args) throws Exception {
        Caixa<String> caixaDeString = new Caixa<>();
        caixaDeString.conteudo.add("String");
        caixaDeString.conteudo.add("String");
        caixaDeString.conteudo.add("String");
        Caixa<Integer> caixaDeInt = new Caixa<>();
        caixaDeInt.conteudo.add(11);
        caixaDeInt.conteudo.add(12);
        caixaDeInt.conteudo.add(13);
        caixaDeString.percorrerConteudo();
        caixaDeInt.percorrerConteudo();
    }
}
