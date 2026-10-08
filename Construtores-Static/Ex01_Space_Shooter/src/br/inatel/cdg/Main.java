// Packages
package br.inatel.cdg;

// Imports
import br.inatel.cdg.Inimigo.Asteroide;
import br.inatel.cdg.Jogador.Nave;

/*
Exercício 1 – Space Shooter

Crie classes Java que sigam o UML apresentado a seguir.
Temos uma estrutura de Classes e uma de Pacotes.
Crie getters e setters que julgar necessário!
Faça os seguintes testes:

-> A Nave pode invocar o método atirar(), recebendo como parâmetro um Asteroide.
-> Existem dois tipos de asteroides: Pequeno e Grande
-> A nave possui dois tipos de tiro: Normal e Explosivo
-> Asteroides do tipo “Grande” são destruídos apenas com Naves que possuem um tipo de tiro
-> “Explosivo”
-> Se o Asteroide for destruído, ele chama o método destruir(), que apenas imprime uma mensagem

OBS: No diagrama de classes UML, quando temos uma seta, é uma relação de dependência. Assim, Nave depende de Asteroide. Pois um método da classe Nave, recebe uma variável do tipo Asteroide. Mas não temos um membro na classe Nave do tipo Asteroide, por isso não temos uma agregação e/ou composição!

ESPECIFICAÇÕES DO DIAGRAMA UML (Space Shooter)

* ESTRUTURA DE PACOTES (PACKAGES):
* - Pacote Raiz: br.inatel.cdg
* - Subpacotes:  .jogador (contém Nave) e .inimigo (contém Asteroide)

* CLASSE: Nave (Pacote: br.inatel.cdg.jogador)
* - Atributos Privados:
*   • nome (String)
*   • vida (double)
*   • tipoTiro (String)

* - Métodos Públicos:
*   • Construtor: Nave(String nome, double vida, String tipoTiro)
*   • Ação: void atirar(Asteroide ast)

* CLASSE: Asteroide (Pacote: br.inatel.cdg.inimigo)
* - Atributos Privados:
*   • nome (String)
*   • tipoAsteroide (String)

* - Métodos Públicos:
*   • Construtor: Asteroide(String nome, String tipoAsteroide)
*   • Ação: void destruir() * * RELACIONAMENTO:
* - Dependência: Nave ➔ Asteroide (A Nave depende de Asteroide como parâmetro no método atirar)

 */
public class Main {
    public static void main(String[] args) {

        // Instanciando objetos
        Nave naveNormal = new Nave("Nave Normal", 100.0, "normal");
        Nave naveGrande = new Nave("Nave Grande", 100.0, "explosivo");

        Asteroide asteroidePequeno = new Asteroide("Asteroide Pequeno", "pequeno");
        Asteroide asteroideGrande = new Asteroide("Asteroide Grande", "grande");

        }
    }