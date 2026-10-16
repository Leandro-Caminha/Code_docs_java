/*
Exercício 01 – Zumbis
Você e seus amigos querem criar um software para modelar zumbis. Crie uma classe que representa um zumbi.
O que um zumbi sabe sobre si? E o que ele sabe fazer?
Depois crie uma classe Principal (App/Main) que use o zumbi e invoque suas ações.
As ações podem ser mostradas via System.out.println();
*/


// Packages
package br.inatel.exzumbis.main;

// Imports
import br.inatel.exzumbis.zumbis.Zumbis;

public class Main {
    public static void main(String[] args) {

        Zumbis zumbi1 = new Zumbis();

        zumbi1.setName("Leandro");
        zumbi1.setAge(40);
        zumbi1.setHeight(1.77);
        zumbi1.setWeight(114.60);
        zumbi1.setWickedness(10);

        System.out.format(
                "O zumbi chamado %s, tem %d anos vagando pela terra. %s, " +
                        "tem %.2f metros de altura e pesa %.2fKg. " +
                        "Ele é considerado com nível %d de maldade.%n",
                zumbi1.getName(),
                zumbi1.getAge(),
                zumbi1.getName(),
                zumbi1.getHeight(),
                zumbi1.getWeight(),
                zumbi1.getWickedness()
        );
        System.out.format("O zumbi chamado %s, só sabe: gritar %s, correr %s e devorar pessoas %s",
                zumbi1.getName(),
                zumbi1.whoop(),
                zumbi1.run(),
                zumbi1.devour()
        );
    }
}