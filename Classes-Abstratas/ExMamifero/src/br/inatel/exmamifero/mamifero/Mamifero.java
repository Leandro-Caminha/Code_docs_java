// Packages
package br.inatel.exmamifero.mamifero;

public abstract class Mamifero {

    // Atributo
    protected String nome;
    protected double vida;

    // Construtor
    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    // Métodos
    public abstract void emitirSom();

    public void mostraInfo() {
        System.out.printf("Nome do mamífero: %s%n", this.nome);
        System.out.printf("Nome do mamífero: %.2f%n%n", this.vida);
    }
}
