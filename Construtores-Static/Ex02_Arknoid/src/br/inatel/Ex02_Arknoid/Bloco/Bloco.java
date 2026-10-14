// Packages
package br.inatel.Ex02_Arknoid.Bloco;

// Imports
import br.inatel.Ex02_Arknoid.Jogador.Jogador;

public class Bloco {

    // Atributos
    private String bloco;
    private int contBlocos = 0;
    private int contBlocosDestruidos = 0;


    // Construtor
    public Bloco() {
        contBlocos++;
    }

    // Métodos
    public void destruirBloco(Jogador jogador, Bloco bloco) {
        System.out.format("O %s destruiu o bloco %s\n", jogador, bloco);
        contBlocosDestruidos++;
        jogador.pontuacao();
    }

    public int getContBlocos() {
        return contBlocos;
    }

    public int getContBlocosDestruidos() {
        return contBlocosDestruidos;
    }
}
