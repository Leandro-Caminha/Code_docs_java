// Packages
package br.inatel.cdg.Inimigo;

public class Asteroide {

    // Atributos
    private String nome;
    private String tipoAsteroide;

    // Construtor
    public Asteroide(String nome, String tipoAsteroide) {
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    // Métodos
    public void destruir() {
        System.out.format("Asteroide %s destruído", tipoAsteroide);
    }
}
