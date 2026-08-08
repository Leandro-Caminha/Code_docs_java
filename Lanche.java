/*
Exercício 1 – Zé do Lanche
Você e seus amigos estão no famoso trailler do Zé e querem computar quantos lanches foram 
consumidos nas últimas três horas. Na primeira hora foram 10, na segunda 4 e na terceira 2. 
Faça um programa que calcule e imprima o número total e a média de lanches consumidos.

Exercício 2 – Zé do Lanche 2
Faça um programa que consiga ler o número de lanches consumidos no trailler do Zé. 
Mostre a soma e a média. Utilize o pacote java.util.Scanner para ler os dados. 
E utilize a saída com o método System.out.println().
*/

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero de lanches:");
        int lanche1 = entrada.nextInt();
        System.out.println("Digite o numero de lanches:");
        int lanche2 = entrada.nextInt();
        System.out.println("Digite o numero de lanches:");
        int lanche3 = entrada.nextInt();

        int soma = lanche1 + lanche2 + lanche3;
        int media = soma / 3;

        System.out.println("O numero total de lanches = " + soma);
        System.out.println("A media de lanches = " + media);

        entrada.close();
    }
}