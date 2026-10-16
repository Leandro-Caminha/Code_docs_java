// Package
package br.inatel.exmariokart.piloto;

public class Piloto {

    // Atributos
    private String nome;
    private boolean vilao;

    // Construtor
    public Piloto() {
    }

    // Métodos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void soltaSuperPoder(){
        System.out.format("O Piloto %s lançou um super poder.%n", this.nome);
    }
}