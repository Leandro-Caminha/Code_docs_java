/*
Exercício 2 – Zumbis!
Você e seus amigos AINDA estão criando um software para modelar zumbis! Considere o UML para modelar o zumbi!
*/

public class Main {
    public static void main(String[] args) {
        
        Zumbi zumbi_1 = new Zumbi();
        zumbi_1.nome = "Leandro";
        zumbi_1.vida = 100;

        Zumbi zumbi_2 = new Zumbi();
        zumbi_2.nome = "Lele";
        zumbi_2.vida = 100;

        zumbi_1.transfereVida(zumbi_2, 85);
    }
}
