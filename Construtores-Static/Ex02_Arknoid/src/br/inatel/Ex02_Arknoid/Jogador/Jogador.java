// Packages
package br.inatel.Ex02_Arknoid.Jogador;

// Imports
import br.inatel.Ex02_Arknoid.Bloco.Bloco;

public class Jogador {

    // Atributos
    private int pontos = 0;

    // Construtor
    public Jogador() {
    }

    // Métodos
    public void destruirBloco(String jogador, Bloco bloco) {
        System.out.format("O %s destruiu um bloco\n\n", jogador);
        bloco.setContBlocosDestruidos();
        this.pontos++;
    }

    public int getPontos() {
        return this.pontos;
    }
}
