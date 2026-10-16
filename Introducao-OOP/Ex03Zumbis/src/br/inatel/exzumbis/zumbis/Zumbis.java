// Packages
package br.inatel.exzumbis.zumbis;

public class Zumbis {

    // Atributos
    private double vida;
    private String nome;

    // Construtor
    public Zumbis() {
    }

    // Métodos
    public void setVida(double vida) {
        this.vida = vida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double mostrarVida() {
        return vida;
    }

    public void transfereVida(Zumbis zumbiAlvo, double quantia) {
        vida -= quantia;
        zumbiAlvo.vida += quantia;
    }
}