// Packages
package br.inatel.excampominado.bomba;

public class Bomba {

    // Atributos
    private final int linha;
    private final int coluna;

    // Construtor
    public Bomba(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    // Métodos
    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }
}