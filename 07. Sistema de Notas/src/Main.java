public class Main {
    public static void main(String[] args) throws Exception {
        Aluno jordan = new Aluno("Jordan");

        jordan.notas.add(5.8);
        jordan.notas.add(7.3);
        jordan.notas.add(2.4);
        jordan.notas.add(9.3);
        jordan.notas.add(4.8);
        jordan.notas.add(5.4);

        double media = jordan.retornarMedia();
        System.out.println(jordan.confereAprovacao() + ": " + String.format("%.2f", media));
    }
}
