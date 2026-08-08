/*
Exercício 3 – Vida de Estudante!
Faça um programa que receba uma NPA e informe se o aluno passou ou se ficou de NP3. 
Caso tenha ficado de NP3, informe a nota e faça a soma com NPA, para o cálculo da NFA. 
Imprima se ele passou ou não! Utilize a classe Scanner para ler as notas do aluno:

Dica: Scanner entrada = new Scanner(System.in);

ps: Lembre-se de importar o pacote para a classe Scanner.
*/

import java.util.Scanner;

public class VidaEstudante {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota da NP1: ");
        float value1 = input.nextFloat();
        System.out.print("Digite a nota da NP2: ");
        float value2 = input.nextFloat();

        float ret = value1 + value2;

        if (ret < 30) {
            System.out.println("ALUNO REPROVADO");
        } else if (ret >= 30 && ret < 60) {
            System.out.println("NP1 + NP2 = " + ret);
            System.out.println("O ALUNO DEVE FAZER A NP3");
            System.out.print("Digite a nota da NP3: ");
            float value3 = input.nextFloat();
            ret = (ret + value3) / 2;
            if (ret < 50) {
                System.out.println("ALUNO REPROVADO");
            } else {
                System.out.println("ALUNO APROVADO");
            }
        } else {
            System.out.println("ALUNO APROVADO");
        }
        input.close();
    }
}