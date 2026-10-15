// Packages
package br.inatel.ex02_arknoid.Jogador;

// Imports
import br.inatel.ex02_arknoid.Bloco.Bloco;

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
