// Packages
package br.inatel.exmariokart.motor;

public class Motor {

    // Atributos
    private String cilindradas;
    private float velocidadeMaxima;

    // Construtor
    public Motor() {
    }

    // Métodos
    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void mostraInfo() {
        System.out.format("Cilindradas: %s%n", this.cilindradas);
        System.out.format("Velocidade: %.2f%n", this.velocidadeMaxima);
    }
}