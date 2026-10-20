/*
Exercício 03 – br.inatel.exzumbis.zumbis.Zumbis!
Você e seus amigos CONTINUAM criando um software para modelar zumbis!
Considerando o zumbi do exercício 2:
- Crie dois zumbis (cada um com seu “new”).
Manipule a vida individualmente
Depois faça ambas as variáveis de referencias iguais
Ex: z1 = z2;
Manipule a vida dos zumbis (através de z1 e z2).
Verifique a vida deles
 */


// Packages
package br.inatel.exzumbis.main;

// Imports
import br.inatel.exzumbis.zumbis.Zumbis;

public class Main {
    public static void main(String[] args) {

        Zumbis zumbi_1 = new Zumbis();
        zumbi_1.setNome("Leandro");
        zumbi_1.setVida(180);

        Zumbis zumbi_2 = new Zumbis();
        zumbi_2.setNome("Lele");
        zumbi_2.setVida(150);

        System.out.printf("Vida do zumbi %s = %.2f%n", zumbi_1.getNome(), zumbi_1.mostrarVida());
        System.out.printf("Vida do zumbi %s = %.2f%n%n", zumbi_2.getNome(), zumbi_2.mostrarVida());

        zumbi_1.transfereVida(zumbi_2, 85);

        System.out.printf("Vida do zumbi %s = %.2f%n", zumbi_1.getNome(), zumbi_1.mostrarVida());
        System.out.printf("Vida do zumbi %s = %.2f%n%n", zumbi_2.getNome(), zumbi_2.mostrarVida());

        zumbi_1 = zumbi_2;

        System.out.printf("Vida do zumbi %s = %.2f%n", zumbi_1.getNome(), zumbi_1.mostrarVida());
        System.out.printf("Vida do zumbi %s = %.2f%n", zumbi_2.getNome(), zumbi_2.mostrarVida());
    }
}