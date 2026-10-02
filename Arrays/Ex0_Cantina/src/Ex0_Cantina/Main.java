/*
Exercício 0
-> Crie classes em Java que atendam as especificações UML abaixo. Crie uma classe Main e, nela,
crie:

* Uma cantina com nome “Cantina do Inatel”
* 3 Salgados da sua escolha
* Adicione os Salgados na Cantina através do metodo addSalgado(Salgado novoSalgado)
* Mostre os Salgados adicionados

Salgado:        1..*     (Agregação)---<>       Cantina:
+nome: String                                   +nome: String
-------------------                             -------------------
                                                +addSalgado(Salgado novoSalgado)
                                                +mostraInfo()

OBS.: Agregação: Cantina <>--- Salgado
      Salgado: Array 1..*
 */

// Packages
package Ex0_Cantina;

// Imports
import Ex0_Cantina.Cantina.Cantina;
import Ex0_Cantina.Salgado.Salgado;

public class Main {
    public static void main(String[] args) {

        Cantina cantina = new Cantina("Cantina do Inatel");
        Salgado salgado1 = new Salgado("Kibe");
        Salgado salgado2 = new Salgado("Croquete");
        Salgado salgado3 = new Salgado("Empada");

        cantina.addSalgados(salgado1);
        cantina.addSalgados(salgado2);
        cantina.addSalgados(salgado3);
        cantina.mostraInfo();
    }
}