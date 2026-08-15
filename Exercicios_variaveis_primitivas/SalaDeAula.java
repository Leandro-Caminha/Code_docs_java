/*
Exercício 4 – Sala de Aula!
Faça um programa que receba o número de alunos matriculados na disciplina C206/C06 e imprima a sala. 
Onde o curso será ministrado. Esse número pode ser 10, 20 ou 30 alunos. 
Caso o número seja 10 ou 20 a sala utilizada pode ser a I-16. 
Caso o número seja 30, então deve ser utilizada a sala I-22. 
Caso o número de alunos não seja nenhum desses 3, o software deve mostrar uma mensagem ao usuário. 
Use a estrutura switch-case. 
*/

import java.util.Scanner;

public class SalaDeAula {
    public static void main(String[] args) {
        
        boolean ret = true;
        Scanner input = new Scanner(System.in);

        while (ret) {
            System.out.print("Digite o numero de alunos para C206/C06: ");
            int value = input.nextInt();
            switch (value) {
            case 10:
                System.out.println("Sala do aluno - I-16");
                ret = false;
                break;
            case 20:
                System.out.println("Sala do aluno - I-16");
                ret = false;
                break;
            case 30:
                System.out.println("Sala do aluno - I-22");
                ret = false;
                break;
            default:
                System.out.println("OBS.: O numero de alunos deve ser 10, 20 ou 30.");
                break;
            }
        }    
    input.close();
    }
}