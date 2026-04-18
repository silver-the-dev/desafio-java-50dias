import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite uma string");
        String str = scn.nextLine();
        System.out.println("Tá aí ó: " + reverseStr(str));
    }
    static String reverseStr(String str){
        char[] rvrs = new char[str.length()];
        char[] origi = str.toCharArray();
        for(int i = 0, j = str.length() - 1; i < str.length(); i++){
            rvrs[i] = origi[j--];
        }
        return new String(rvrs);
    }
}
