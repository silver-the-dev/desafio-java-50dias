import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Valor: ");
        int num = Integer.parseInt(scn.nextLine());

        if(num < 10){
            throw new SaldoInsuficienteException("Saldo baixo");
        }
    }
}
