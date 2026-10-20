package br.inatel.exbrownie.brownie;

public class Brownie {

    // Atributos
    protected final String nome;
    protected final double preco;
    protected final String sabor;

    // Construtor
    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    // Métodos
    public void addCarrinhoDeCompras() {
        System.out.printf("Adicionado no carrinho: %s%n", this.nome);
    }

    public void calculaValorTotalCompra() {
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Preço: %.2f%n%n", this.preco);
    }

    public void mostraInfo() {
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Preço: %.2f%n", this.preco);
        System.out.printf("Sabor: %s%n%n", this.sabor);
    }
}
