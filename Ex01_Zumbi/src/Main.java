/*
Exercício 1 – Zumbis
Você e seus amigos querem criar um software para modelar zumbis. Crie uma classe que representa um zumbi. O que um zumbi sabe sobre si? E o que ele sabe fazer?
Depois crie uma classe Principal (App/Main) que use o zumbi e invoque suas ações.
As ações podem ser mostradas via System.out.println();
*/

public class Main {

    public static void main(String[] args) throws Exception {
        
        Zumbis zumbi_1 = new Zumbis();

        zumbi_1.name = "Leandro";
        zumbi_1.age = 40;
        zumbi_1.height = 1.77;
        zumbi_1.weight = 114.6;
        zumbi_1.wickedness = 10;
        
        zumbi_1.whoop();
        zumbi_1.run();
        zumbi_1.devour();
    }
}