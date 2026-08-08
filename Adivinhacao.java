/*
Exercício 5 – Adivinhação!
Faça um programa que gere um número aleatório entre 1 e 10, e depois pergunte ao usuário. 
Qual número foi gerado. O jogo deve continuar até que o usuário adivinhe o número.

Dica: use Random rand = new Random();	
	int x = rand.nextInt(10) + 1; // Gera número entre 1 e 10
*/

import java.util.Random;

public class Adivinhacao {
    public static void main(String[] args) {
        
        Random rand = new Random();

        int input = rand.nextInt(10) + 1; // Gera número entre 1 e 10


    }
}
