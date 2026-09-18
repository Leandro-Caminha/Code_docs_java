package Brownie;

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
        System.out.format("Adicionado no carrinho: %s\n", nome);
    }

    public void calculaValorTotalCompra() {
        System.out.format("Nome: %s\n", nome);
        System.out.format("Preço: %f\n", preco);
    }

    public void mostraInfo() {
        System.out.format("Nome: %s\n", nome);
        System.out.format("Preço: %f\n", preco);
        System.out.format("Nome: %s\n", sabor);
    }
}
