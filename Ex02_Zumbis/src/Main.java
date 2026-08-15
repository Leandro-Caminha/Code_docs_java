/*
Exercício 2 – Zumbis!
Você e seus amigos AINDA estão criando um software para modelar zumbis! Considere o UML para modelar o zumbi!
*/

public class Main {
    public static void main(String[] args) {

        Zumbis zumbi_1 = new Zumbis();
        zumbi_1.nome = "Leandro";
        zumbi_1.vida = 150;

        Zumbis zumbi_2 = new Zumbis();
        zumbi_2.nome = "Lele";
        zumbi_2.vida = 100;

        System.out.format("Vida do zumbi %s = %.2f%n",
                zumbi_1.nome,
                zumbi_1.mostrarVida());
        System.out.format("Vida do zumbi %s = %.2f%n",
                zumbi_2.nome,
                zumbi_2.mostrarVida());

        zumbi_1.transfereVida(zumbi_2, 85);

        System.out.format("Vida do zumbi %s = %.2f%n",
                zumbi_1.nome,
                zumbi_1.mostrarVida());
        System.out.format("Vida do zumbi %s = %.2f%n",
                zumbi_2.nome,
                zumbi_2.mostrarVida());
    }
}
