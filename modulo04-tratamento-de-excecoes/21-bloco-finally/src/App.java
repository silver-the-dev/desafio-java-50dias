import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        try{
            int onze = Integer.parseInt(scn.nextLine());
            System.out.println(onze);
        } catch(Exception e){
            System.err.println("Erro encontrado: " + e.getMessage());
        } finally{
            if(scn != null){
                scn.close();
                System.out.println("Scanner fechado");
            }
        }
    }
}
