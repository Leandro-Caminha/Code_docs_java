package br.inatel.exbrownie.brownie.browniedocedeleite;

import br.inatel.exbrownie.brownie.Brownie;

public class BrownieDoceDeLeite extends Brownie {

    // Construtor
    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    // Métodos
    public void adicionaDoceDeLeite() {
        System.out.printf("Item adicionado: %s%n", this.nome);
    }
}
