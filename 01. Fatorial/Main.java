import java.util.Scanner;

public class Main {
    static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int valor = scn.nextInt();
        System.out.println(retornaFatorial(valor));
    }
    static int retornaFatorial(int valor){
        for(int i = valor; i > 1;){
            valor *= --i;
        }
        return valor;
    }
}
