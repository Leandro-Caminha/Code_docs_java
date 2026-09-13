// Packages
package PCMania.MemoriaUSB;

public class MemoriaUSB {

    // Atributos
    private static String nome;
    private static int capacidade;

    // Construtor
    public MemoriaUSB(String nome, int capacidade) {
        MemoriaUSB.nome = nome;
        MemoriaUSB.capacidade = capacidade;
    }

    // Métodos
    public static String getNome() {
        return nome;
    }

    public static int getCapacidade() {
        return capacidade;
    }
}
