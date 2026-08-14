/*
Exercício 1 – Zumbis
Você e seus amigos querem criar um software para modelar zumbis. Crie uma classe que representa um zumbi. O que um zumbi sabe sobre si? E o que ele sabe fazer?
Depois crie uma classe Principal (App/Main) que use o zumbi e invoque suas ações.
As ações podem ser mostradas via System.out.println();
*/

public class Main {

    public static void main(String[] args) {

        Zumbis zumbi_1 = new Zumbis();

        zumbi_1.name = "Leandro";
        zumbi_1.age = 40;
        zumbi_1.height = 1.77;
        zumbi_1.weight = 114.60;
        zumbi_1.wickedness = 10;

        System.out.format(
                "O zumbi chamado %s, tem %d anos vagando pela terra. %s, tem %.2f metros de altura e pesa %.2fKg. Ele é considerado com nivel %d de maldade.%n",
                zumbi_1.name, 
                zumbi_1.age, 
                zumbi_1.name, 
                zumbi_1.height, 
                zumbi_1.weight, 
                zumbi_1.wickedness
            );
        System.out.format("O zumbi chamado %s, só sabe: gritar %s, correr %s e devorar pessoas %s",
                zumbi_1.name,
                zumbi_1.whoop(),
                zumbi_1.run(),
                zumbi_1.devour()
            );
    }
}