// Packages
package br.inatel.exmamifero.mamifero.cachorro;

// Imports
import br.inatel.exmamifero.mamifero.Mamifero;

public class Cachorro extends Mamifero {

    // Construtor
    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    // Métodos
    @Override
    public void emitirSom() {
        System.out.println("Auauauauauau...%n%n");
    }
}
