// Packages
package br.inatel.Ex02_Arknoid.Conversor;

public class Conversor {

    public static void convert(String jogador, int pontos) {
        System.out.format("Total de pontos do jogador: %d\n", pontos);
        System.out.format("Total de moedas do %s: %d\n", jogador, (pontos * 100));
    }
}
