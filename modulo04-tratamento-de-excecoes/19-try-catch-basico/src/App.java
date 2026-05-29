import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Número 1: ");
            int num = Integer.parseInt(scan.nextLine());
            System.out.print("Número 2: ");
            int num2 = Integer.parseInt(scan.nextLine());
            System.out.print("Resultado: " + (num / num2));
        } catch(Exception e){
            System.out.println("Deu erro: " + e.getMessage());
        }
        scan.close();
    }
}
