// Packages
package br.inatel.exmariokart.kart;

// Imports
import br.inatel.exmariokart.motor.Motor;
import br.inatel.exmariokart.piloto.Piloto;

public class Kart {

    // Atributos
    private String nome;
    private final Motor motor;
    private Piloto piloto;

    // Construtor
    public Kart() {
        this.motor = new Motor();
    }

    // Métodos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

        public void pular() {
        System.out.format("O kart %s esta pulando!%n", this.nome);
    }

    public void soltarTurbo(){
        System.out.format("O kart %s pilotado pelo %s esta soltando turbo!%n",
                this.nome,
                piloto.getNome()
        );
    }

    public void fazerDrift() {
        System.out.format("O kart %s pilotado pelo %s esta fazendo drift!%n",
                this.nome,
                piloto.getNome()
        );
    }
}