// Packages
package PCMania.HardwareBasico;

public class HardwareBasico {

    // Atributos
    private final String nome;
    private final float capacidade;

    //Construtor
    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    // Métodos
    public String getNome() {
        return nome;
    }

    public float getCapacidade() {
        return capacidade;
    }
}
