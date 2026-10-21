// Packages
package br.inatel.exspaceshooter.inimigo;

public class Asteroide {

    // Atributos
    private final String nome;
    private final String tipoAsteroide;

    // Construtor
    public Asteroide(String nome, String tipoAsteroide) {
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    // Métodos
    public void destruir() {
        System.out.printf("Asteroide chamado %s de tipo %s destruído%n",
                this.nome,
                this.tipoAsteroide
        );
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }
}
