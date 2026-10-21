// Packages
package br.inatel.exbandas.membro;

public class Membro {

    // Atributos
    private final String nome;
    private final String funcao;

    // Construtor
    public Membro(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }
}
