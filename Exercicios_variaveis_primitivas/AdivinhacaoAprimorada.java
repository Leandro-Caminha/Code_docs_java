/*
Exercício 6 – Adivinhação Aprimorado!
Repita o exercício anterior, mas informe o usuário se o número que ele digitou é maior ou menor. 
Que o gerado pelo computador!
*/

import java.util.Random;
import java.util.Scanner;

public class AdivinhacaoAprimorada {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int input_system = rand.nextInt(10) + 1; // Gera um número entre 1 e 10
        int input_user;

        do {
            System.out.print("Qual numero foi gerado de 1 a 10: ");
            input_user = input.nextInt();
            if (input_user == input_system) {
                System.out.println("***ACERTOU***");
            } else if (input_user < input_system) {
                System.out.println("***ERROU - NUMERO MENOR QUE O GERADO PELO COMPUTADOR***");
            } else {
                System.out.println("***ERROU - NUMERO MAIOR QUE O GERADO PELO COMPUTADOR***");
            }
        } while (input_system != input_user);
        input.close();    
    }
}