// Packages
package br.inatel.exbandas.empresario;

import br.inatel.exbandas.musica.Musica;

public class Empresario {

    // Atributos
    private final String nome;
    private final long cnpj;

    // Construtor
    public Empresario(String nome, long cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public long getCnpj() {
        return cnpj;
    }
}
