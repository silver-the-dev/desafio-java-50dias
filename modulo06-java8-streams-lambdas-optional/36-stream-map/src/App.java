import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Aluno> alunos = new ArrayList<>(Arrays.asList(
                new Aluno("Jorge", 15),
                new Aluno("Mateus", 17),
                new Aluno("Amanda", 14),
                new Aluno("Maria", 16)));

        ArrayList<String> nomeDeAlunos = new ArrayList<>(
                alunos.stream()
                        .map(nome -> nome.getNome())
                        .toList());

        System.out.println(nomeDeAlunos);
    }
}
