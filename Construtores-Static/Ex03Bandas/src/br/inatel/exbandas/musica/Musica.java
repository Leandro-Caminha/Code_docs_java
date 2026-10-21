// Packages
package br.inatel.exbandas.musica;

public class Musica {

    // Atributos
    private final String nome;
    private final double duracao;

    // Construtor
    public Musica(String nome, double duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getDuracao() {
        return duracao;
    }
}
