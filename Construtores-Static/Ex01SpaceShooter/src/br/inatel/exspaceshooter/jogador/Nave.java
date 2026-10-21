// Packages
package br.inatel.exspaceshooter.jogador;

// Imports
import br.inatel.exspaceshooter.inimigo.Asteroide;

public class Nave {

    // Atributos
    private final String nome;
    private final Double vida;
    private final String tipoTiro;

    // Construtor
    public Nave(String nome, Double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    // Métodos
    public void atirar(Asteroide asteroide) {
        if (tipoTiro.equals("normal") && asteroide.getTipoAsteroide().equals("pequeno")) {
            asteroide.destruir();
        } else if (tipoTiro.equals("explosivo")) {
            asteroide.destruir();
        } else {
            System.out.printf("A nave %s de vida %.2f, não pode destruir um asteroide grande.",
                    this.nome,
                    this.vida
            );
        }
    }
}