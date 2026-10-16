// Packages
package br.inatel.exmariokart.kart;

public class Kart {

    // Atributos
    private String nome;
    private Motor motor;
    private Piloto piloto;

    // Construtor
    public Kart() {
        this.motor = new Motor();
    }

    // Métodos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void pular() {
        System.out.format("O Carro %s esta pulando!", this.nome);
    }

    void soltarTurbo(){
        System.out.format("O Carro %s esta soltando turbo!", this.nome);
    }

    void fazerDrift() {
        System.out.format("O Carro %s esta fazendo drift!", this.nome);
    }
}