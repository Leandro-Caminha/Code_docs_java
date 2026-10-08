// Packages
package br.inatel.cdg.Jogador;

// Imports
import br.inatel.cdg.Inimigo.Asteroide;

public class Nave {

    // Atributos
    private String nome;
    private Double vida;
    private String tipoTiro;

    // Construtor
    public Nave(String nome, Double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    // Métodos
    public void atirar(Asteroide ast) {
    }
}
