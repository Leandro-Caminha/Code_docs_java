// Packages
package br.inatel.exbandas.banda;

public class Banda {

    // Atributos
    private final String nome;
    private final String genero;

    // Construtor
    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    // Métodos
    public void mostraInfo(){
        System.out.printf("Nome: %s", this.nome);
        System.out.printf("Genero: %s", this.genero);
    }
}
