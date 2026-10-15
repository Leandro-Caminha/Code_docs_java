// Packages
package br.inatel.ex02_arknoid.Conversor;

public class Conversor {

    public static void convert(String jogador, int pontos) {
        System.out.format("Total de pontos do %s: %d\n", jogador, pontos);
        System.out.format("Total de moedas do %s: %d\n\n", jogador, (pontos * 100));
    }
}
