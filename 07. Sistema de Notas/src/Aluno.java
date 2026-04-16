import java.util.ArrayList;
import java.util.List;

public class Aluno {
    List<Double> notas;
    String nome;

    public Aluno(String nome){
        this.nome = nome;
        notas = new ArrayList<>();
    }

    public double retornarMedia(){
        int dividirPor = 0;
        double resultado = 0;
        for(double nota : notas){
            resultado += nota;
            dividirPor++;
        }
        return resultado / dividirPor;
    }
    public String confereAprovacao(){
        return retornarMedia() >= 7.0 ? "Aprovado" : "Reprovado";
    }
}