package Brownie;

public class BrownieNutella extends Brownie {

    // Construtor
    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    // Métodos
    public void adicionaNutrlla() {
        System.out.format("Item adicionado: %s\n", nome);
    }
}
