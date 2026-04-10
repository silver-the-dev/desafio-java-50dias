import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Este é o jogo de adivinhação de 1 a 100, tente adivinhar o número que irei gerar!");
        Random rand = new Random();
        int numero = rand.nextInt(100) + 1;
        System.out.println(numero);
        int guess = 0;
        while(guess != numero){
            System.out.println("Faça sua tentativa: ");
            guess = Integer.parseInt(scn.nextLine());
            if(guess == numero) break;
            else{ 
                System.out.println("Errou");
                System.out.println(guess > numero ? "Pra baixo" : "Pra cima");
            }
        }
        System.out.println("Acertou");
    } 
}