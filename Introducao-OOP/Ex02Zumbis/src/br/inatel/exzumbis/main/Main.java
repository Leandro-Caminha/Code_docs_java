/*
Exercício 02 – Zumbis!
Você e seus amigos AINDA estão criando um software para modelar zumbis! Considere o UML para modelar o zumbi!
*/


// Packages
package br.inatel.exzumbis.main;

// Imports
import br.inatel.exzumbis.zumbis.Zumbis;

public class Main {
    public static void main(String[] args) {

        Zumbis zumbi_1 = new Zumbis();
        zumbi_1.setNome("Leandro");
        zumbi_1.setVida(150);

        Zumbis zumbi_2 = new Zumbis();
        zumbi_2.setNome("Lele");
        zumbi_2.setVida(100);

        System.out.format("Vida do zumbi %s = %.2f%n",
                zumbi_1.getNome(),
                zumbi_1.mostrarVida()
        );
        System.out.format("Vida do zumbi %s = %.2f%n",
                zumbi_2.getNome(),
                zumbi_2.mostrarVida()
        );

        zumbi_1.transfereVida(zumbi_2, 85);

        System.out.format("Vida do zumbi %s = %.2f%n",
                zumbi_1.getNome(),
                zumbi_1.mostrarVida()
        );
        System.out.format("Vida do zumbi %s = %.2f%n",
                zumbi_2.getNome(),
                zumbi_2.mostrarVida()
        );
    }
}