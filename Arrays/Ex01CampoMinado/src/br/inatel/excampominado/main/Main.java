/*
Exercício 01 – Campo Minado (Desafio)

-> Simule um jogo de campo minado, através de uma matriz 2x2.

-> Coloque uma bomba em uma posição aleatória e peça para o usuário caminhar pelo Campo Minado,
(pergunte qual posição ele deseja acessar) até que ele consiga caminhar sem atingir nenhuma bomba.

-> Caso ele pise na mina, avise através de mensagens. Ele deverá percorrer novamente o Campo,
mas agora já saberá onde tem uma mina.

Random rand = new Random();
---> Gera num aleatório entre 0 e 1
int x = rand.nextInt(2);

---> Para ler do teclado a posição digitada
Scanner entrada = new Scanner(System.in);
int digitado = entrada.nextInt();
 */


// Packages
package br.inatel.excampominado.main;

// Imports
import br.inatel.excampominado.jogador.Jogador;
import br.inatel.excampominado.jogo.Jogo;

public class Main {
    public static void main(String[] args) {

        Jogador jogador = new Jogador();

        Jogo jogo = new Jogo(jogador);

        jogo.iniciarJogo();
    }
}