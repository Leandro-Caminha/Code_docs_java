// Packages
package br.inatel.exmamifero.mamifero.lontra;

// Imports
import br.inatel.exmamifero.mamifero.Mamifero;

public class Lontra extends Mamifero {

    // Construtor
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    // Métodos
    @Override
    public void emitirSom() {
        System.out.println("Uhuhuhuhuhu...%n%n");
    }
}