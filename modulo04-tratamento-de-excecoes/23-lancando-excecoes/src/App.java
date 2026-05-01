import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        try{
            System.out.print("Digite seu email: ");
            String email = scn.nextLine();
            if(email.contains("@")){
                System.out.println("Email válido!");
            } else{
                scn.close();
                throw new IllegalArgumentException("Email inválido");
            }
        } catch(IllegalArgumentException e){
            System.err.println("Erro: " + e.getMessage());
        }

        if(scn != null) scn.close();
    }
}
