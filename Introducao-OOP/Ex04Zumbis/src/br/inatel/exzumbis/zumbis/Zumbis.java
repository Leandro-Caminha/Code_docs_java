// Packages
package br.inatel.exzumbis.zumbis;

public class Zumbis {

    // Atributos
    private String nome;
    private double vida;

    //Construtor
    public Zumbis() {
    }

    // Métodos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double mostrarVida() {
        return vida;
    }

    public boolean transfereVida(Zumbis zumbiAlvo, double quantia) {
        if (vida >= quantia) {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            System.out.println("***VIDA TRANSFERIDA COM SUCESSO***");
            return true;
        }
        else {
            System.out.println("***VIDA INSUFICIENTE***");
            return false;
        }
    }
}