/*
Exercício 4 – Zumbis!
Sim isso mesmo, ainda estão no zumbis! Modifique o Zumbi do Exercício 2 para atender a seguinte especificação
A ação de transferir vida faz uma verificação antes
se de fato é possível ser realizada.
Ele retorna um booleano informando se deu certo a 
transferência
- Modifique o Diagrama para atender o novo requisito
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int quantia;

        // Instanciando obejetos da classe Zumbis
        Zumbis zumbi1 = new Zumbis();
        zumbi1.nome = "Leandro";
        zumbi1.vida = 100;

        Zumbis zumbi2 = new Zumbis();
        zumbi2.nome = "Lele";
        zumbi2.vida = 50;

        // Saída de dados da vida dos zumbis criados
        System.out.format("Vida do zumbi %s = %.2f%n",
                zumbi1.nome,
                zumbi1.mostrarVida());
        System.out.format("Vida do zumbi %s = %.2f%n%n",
                zumbi2.nome,
                zumbi2.mostrarVida());

        // Entrada de dados para a quantia de vida que se quer transefrir
        System.out.format(
            "Qual a quantia de vida, quer transferir do zumbi %s para %s: ",
            zumbi1.nome,
            zumbi2.nome
        );
        quantia = input.nextInt();

        // Verificação se possível transferir vida pelo método transfereVida
        if (zumbi1.transfereVida(zumbi2, quantia)) {
            System.out.format("Vida do zumbi %s = %.2f%n",
                    zumbi1.nome,
                    zumbi1.mostrarVida());
            System.out.format("Vida do zumbi %s = %.2f%n%n",
                    zumbi2.nome,
                    zumbi2.mostrarVida());
        } else {
            System.out.println("***IMPOSSIVEL TRANSFERIR VIDA***");
        }
        input.close();
    }
}