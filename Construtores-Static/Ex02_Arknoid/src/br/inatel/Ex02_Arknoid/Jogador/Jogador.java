// Packages
package br.inatel.Ex02_Arknoid.Jogador;

public class Jogador {

    // Atributos
    private String jogador;
    private int pontos = 0;

    // Construtor
    public Jogador() {
    }

    // Métodos
    public void pontuacao() {
        pontos++;
    }

    public int getPontos() {
        return pontos;
    }
}
