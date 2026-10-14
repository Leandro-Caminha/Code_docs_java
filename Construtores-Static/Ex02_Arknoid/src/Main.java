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

// Imports
import br.inatel.Ex02_Arknoid.Bloco.Bloco;
import br.inatel.Ex02_Arknoid.Conversor.Conversor;
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

        jogador1.destruirBloco("Jogador1", bloco1);
        jogador2.destruirBloco("Jogador2", bloco2);
        jogador3.destruirBloco("Jogador3", bloco3);
        jogador1.destruirBloco("Jogador1", bloco4);
        jogador2.destruirBloco("Jogador2", bloco5);
        jogador3.destruirBloco("Jogador3", bloco6);

        Conversor.convert("Jogador1", jogador1.getPontos());
        Conversor.convert("Jogador2", jogador2.getPontos());
        Conversor.convert("Jogador3", jogador2.getPontos());

        bloco1.getContBlocos();
        bloco2.getContBlocosDestruidos();
    }
}