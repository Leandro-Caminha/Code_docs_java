/*
Exercício 5 – Adivinhação!
Faça um programa que gere um número aleatório entre 1 e 10, e depois pergunte ao usuário. 
Qual número foi gerado. O jogo deve continuar até que o usuário adivinhe o número.

Dica: use Random rand = new Random();	
	int x = rand.nextInt(10) + 1; // Gera número entre 1 e 10
*/

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
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
            } else {
                System.out.println("***ERROU***");
            }
        } while (input_system != input_user);
        input.close();
    }
}