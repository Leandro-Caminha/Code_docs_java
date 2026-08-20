/*
Exercício 1 – Zumbis
Você e seus amigos querem criar um software para modelar zumbis. Crie uma classe que representa um zumbi.
O que um zumbi sabe sobre si? E o que ele sabe fazer?
Depois crie uma classe Principal (App/Main) que use o zumbi e invoque suas ações.
As ações podem ser mostradas via System.out.println();
*/

public class Main {

    public static void main(String[] args) {

        Zumbis zumbi1 = new Zumbis();

        zumbi1.name = "Leandro";
        zumbi1.age = 40;
        zumbi1.height = 1.77;
        zumbi1.weight = 114.60;
        zumbi1.wickedness = 10;

        System.out.format(
                "O zumbi chamado %s, tem %d anos vagando pela terra. %s, tem %.2f metros de altura e pesa %.2fKg. " +
                        "Ele é considerado com nivel %d de maldade.%n",
                zumbi1.name,
                zumbi1.age,
                zumbi1.name,
                zumbi1.height,
                zumbi1.weight,
                zumbi1.wickedness
        );
        System.out.format("O zumbi chamado %s, só sabe: gritar %s, correr %s e devorar pessoas %s",
                zumbi1.name,
                zumbi1.whoop(),
                zumbi1.run(),
                zumbi1.devour()
        );
    }
}