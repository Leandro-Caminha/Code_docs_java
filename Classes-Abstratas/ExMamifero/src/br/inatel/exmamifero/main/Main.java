/*
Exercícios Mamíferos

- Crie classes Java para modelar o UML no próximo slide
- Crie uma classe br.inatel.exmamifero.main.Main, com método main() para fazer o teste!
- Cada classe que herda de Mamífero, deve implementar o seu método emitirSom().
- Pode apenas imprimir mensagens.
- Esse exercício está separado do exemplo apresentado nessa aula.
- A classe Mamifero e o método emitirSom() são abstratos.

* Hierarquia de classes representada no diagrama UML:
 *
 * Mamifero (classe abstrata)
 *   Atributos (protected):
 *     - String nome
 *     - double vida
 *   Métodos:
 *     + Mamifero(String nome, double vida)  -> construtor
 *     + emitirSon()                         -> método abstrato (cada subclasse implementa o seu)
 *     + mostraInfo()                        -> método concreto que exibe as informações do mamífero
 *
 * Subclasses (herdam de Mamifero):
 *   - Cachorro(String nome, double vida)
 *   - Lontra(String nome, double vida)
 *   - Boi(String nome, double vida)
 *
 * Cada subclasse chama o construtor da superclasse (super) e implementa
 * o método emitirSon() com o som característico do animal.

 */


// Packages
package br.inatel.exmamifero.main;

// Imports
import br.inatel.exmamifero.mamifero.Mamifero;
import br.inatel.exmamifero.mamifero.boi.Boi;
import br.inatel.exmamifero.mamifero.cachorro.Cachorro;
import br.inatel.exmamifero.mamifero.lontra.Lontra;

public class Main {
    public static void main(String[] args) {

        Mamifero cachorro = new Cachorro("Nala", 100);
        Mamifero boi = new Boi("Hummer", 150);
        Mamifero lontra = new Lontra("Chico", 200);

        cachorro.emitirSom();
        boi.emitirSom();
        lontra.emitirSom();

        cachorro.mostraInfo();
        boi.mostraInfo();
        lontra.mostraInfo();
    }
}