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

package br.inatel.cdg.exercicio0;

public class Main {
    public static void main(String[] args) {

        Cantina cantina = new Cantina();
        cantina.nome = "Cantina do Inatel";

        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        salgado1.nome = "Coxinha";
        salgado2.nome = "Esfirra";
        salgado3.nome = "Enroladinho";

        cantina.addSalgados(salgado1);
        cantina.addSalgados(salgado2);
        cantina.addSalgados(salgado3);
        cantina.mostraInfo();
    }
}