// Packages
package br.inatel.exarknoid.conversor;

public class Conversor {

    // Métodos
    public static void convert(String jogador, int pontos) {
        System.out.printf("Total de pontos do %s: %d%n", jogador, pontos);
        System.out.printf("Total de moedas do %s: %d%n%n", jogador, (pontos * 100));
    }
}
