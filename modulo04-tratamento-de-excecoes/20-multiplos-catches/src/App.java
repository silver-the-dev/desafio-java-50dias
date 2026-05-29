import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try{
            int escolha = Integer.parseInt(scn.nextLine());
            if(escolha == 1){
                int asd = Integer.parseInt("Três");
            } else{
                int[] arey = new int[5];
                System.err.println(arey[6]);
            }
        } catch(NumberFormatException e){
            System.out.println("Erro de numero: " + e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro de array: " + e.getMessage());
        }
        scn.close();
    }
}
