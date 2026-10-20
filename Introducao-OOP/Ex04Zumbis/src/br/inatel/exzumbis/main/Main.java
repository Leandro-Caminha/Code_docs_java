/*
Exercício 04 – br.inatel.exzumbis.zumbis.Zumbis!
Sim isso mesmo, ainda estão no zumbis! Modifique o Zumbi do Exercício 2 para atender a seguinte especificação
A ação de transferir vida faz uma verificação antes
se de fato é possível ser realizada.
Ele retorna um booleano informando se deu certo a
transferência
- Modifique o Diagrama para atender o novo requisito
 */


// Packages
package br.inatel.exzumbis.main;

// Imports
import br.inatel.exzumbis.zumbis.Zumbis;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int quantia;

        Zumbis zumbi1 = new Zumbis();
        zumbi1.setNome("Leandro");
        zumbi1.setVida(100);

        Zumbis zumbi2 = new Zumbis();
        zumbi2.setNome("Lele");
        zumbi2.setVida(50);

        System.out.printf("Vida do zumbi %s = %.2f%n", zumbi1.getNome(), zumbi1.mostrarVida());
        System.out.printf("Vida do zumbi %s = %.2f%n%n", zumbi2.getNome(), zumbi2.mostrarVida());

        System.out.printf("Qual a quantia de vida, quer transferir do zumbi %s para %s: ",
                zumbi1.getNome(),
                zumbi2.getNome()
        );

        quantia = input.nextInt();

        if (zumbi1.transfereVida(zumbi2, quantia)) {
            System.out.printf("Vida do zumbi %s = %.2f%n", zumbi1.getNome(), zumbi1.mostrarVida());
            System.out.printf
                    ("Vida do zumbi %s = %.2f%n%n", zumbi2.getNome(),
                    zumbi2.mostrarVida());
        } else {
            System.out.println("*** IMPOSSÍVEL TRANSFERIR VIDA ***");
        }
        
        input.close();
    }
}