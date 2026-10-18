package br.inatel.exbrownie.main;/*
Ex01_Brownie

- Crie classes que modelam o diagrama UML do próximo slide
- Faça testes na classe br.inatel.exbrownie.main.Main
- Os métodos devem imprimir de forma trivial o comportamento, sempre exibindo o nome de quem está
 fazendo aquela ação.
- O método mostraInfo() deve mostrar o valor de todos os atributos.
- O método calculaValorTotalCompra() deve imprimir, além do nome, o preço do Brownie.

*/

// Imports packages

import br.inatel.exbrownie.brownie.browniecafe.BrownieCafe;
import br.inatel.exbrownie.brownie.browniedocedeleite.BrownieDoceDeLeite;
import br.inatel.exbrownie.brownie.brownienutella.BrownieNutella;

public class Main {
    public static void main(String[] args) {

        // Instanciando objetos da classe Brownie
        BrownieCafe brownie_cafe = new BrownieCafe("Brownie Café", 35.00, "café");
        BrownieDoceDeLeite brownie_doce = new BrownieDoceDeLeite(
                "Brownie Doce de Leite",
                45.00,
                "doce de leite"
        );
        BrownieNutella brownie_nutella = new BrownieNutella("Brownie de Nutella", 55.00, "nutella");

        // Chamada dos métodos
        brownie_cafe.adicionaCafe();
        brownie_cafe.addCarrinhoDeCompras();
        brownie_cafe.calculaValorTotalCompra();
        brownie_cafe.mostraInfo();

        brownie_doce.adicionaDoceDeLeite();
        brownie_doce.addCarrinhoDeCompras();
        brownie_doce.calculaValorTotalCompra();
        brownie_doce.mostraInfo();

        brownie_nutella.adicionaNutella();
        brownie_nutella.addCarrinhoDeCompras();
        brownie_nutella.calculaValorTotalCompra();
        brownie_nutella.mostraInfo();
    }
}
