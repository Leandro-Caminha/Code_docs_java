// Packages
package br.inatel.exzumbis.personagem;

// Imports
import br.inatel.exzumbis.arma.Arma;

public class Personagem {

    // Atributos
    private String nome;
    private int pontos;
    private Arma arma;

    // Construtor
    public Personagem() {
    }

    // Métodos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getPontos() {
        return pontos;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public void tomarDano() {
        this.pontos -= 5;
    }

    public void usarArma() {
        arma.setResistencia(arma.getResistencia() - 2);
    }
}