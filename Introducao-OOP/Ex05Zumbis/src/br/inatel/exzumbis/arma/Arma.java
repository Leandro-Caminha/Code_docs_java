// Packages
package br.inatel.exzumbis.arma;

public class Arma {

    // Atributos
    private String nome;
    private int poder;
    private int resistencia;
    private String descricao;

    // Construtor
    public Arma() {
    }

    // Métodos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void mostrarInfoArma() {
        System.out.format("Nome da arma: %s%n", nome);
        System.out.format("Poder da arma: %d%n", poder);
        System.out.format("Resistência da arma: %d%n", resistencia);
        System.out.format("Descrição da arma: %s%n", descricao);
    }
}