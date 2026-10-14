/*
Exercício  - Arkanoid

Simule um jogo de Arkanoid. Construa duas classes, Jogador e Bloco.
Lembre-se de utilizar pacotes para organizar.
A cada novo bloco, incremente o número de blocos em jogo.
A cada bloco destruído, decremente o número de blocos em jogo e aumente a pontuação do Jogador.
Ao final, imprima o número de blocos criados, destruídos e a pontuação do jogador.
Crie um método estático em uma classe Conversor que converte a pontuação do jogador em moedas.
1 ponto = 100 moedas. Mostre o número de moedas na classe Main.

 */

import br.inatel.Ex02_Arknoid.Bloco.Bloco;
import br.inatel.Ex02_Arknoid.Jogador.Jogador;

public class Main {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();
        Jogador jogador3 = new Jogador();

        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();
        Bloco bloco4 = new Bloco();
        Bloco bloco5 = new Bloco();
        Bloco bloco6 = new Bloco();
        Bloco bloco7 = new Bloco();

    }
}