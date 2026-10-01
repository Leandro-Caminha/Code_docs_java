package Mamifero;

public abstract class Mamifero {

    // Atributos
    protected String nome;
    protected double vida;

    // Construtor
    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    // Métodos
    public abstract void emitirSom();

    public abstract void mostraInfo();
}