// Packages
package PCMania.MemoriaUSB;

public class MemoriaUSB {

    // Atributos
    private final String nome;
    private final int capacidade;

    // Construtor
    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    // Métodos

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }
}
