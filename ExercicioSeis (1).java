import java.util.Scanner;
import java.util.Random;

public class ExercicioSeis6 {

    public static void main(String[] args) {

        int min,max, randomNumber;

        Scanner scanner = new Scanner (System.in);
        Random random = new Random();

        System.out.println("PROGRAMAÇÃO DE SOLUCÕES COMPUTACIONAIS");
        System.out.println("         TERCEIRA LISTA");


        
            System.out.println("\n Insira o primeiro número: ");
            min = scanner.nextInt();

            System.out.println("\n Insira o segundo número: ");
            max = scanner.nextInt();

            while (max < min){
            System.out.println("O primeiro número informado deve ser menor que o segundo.");
            System.out.println("Tente novamente!");

            System.out.println("\n Insira o primeiro número: ");
            min = scanner.nextInt();

            System.out.println("\n Insira o segundo número: ");
            max = scanner.nextInt();
            }

         randomNumber = min + (int)(Math.random() * ((max - min) + 1));
         System.out.println("\nO número aleatório é: " + randomNumber);
        
    }
}
