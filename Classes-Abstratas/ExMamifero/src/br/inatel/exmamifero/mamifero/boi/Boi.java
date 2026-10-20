// Packages
package br.inatel.exmamifero.mamifero.boi;

// Imports
import br.inatel.exmamifero.mamifero.Mamifero;

public class Boi extends Mamifero {

    // Construtor
    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    // Métodos
    @Override
    public void emitirSom() {
        System.out.println("Hummmmm...Hummmmmm...%n%n");
    }
}
