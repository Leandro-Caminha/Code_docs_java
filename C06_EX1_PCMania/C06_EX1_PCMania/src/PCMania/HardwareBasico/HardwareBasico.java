// Packages
package PCMania.HardwareBasico;

public class HardwareBasico {

    // Atributos
    private static String nome;
    private static float capacidade;

    //Construtor
    public HardwareBasico(String nome, float capacidade) {
        HardwareBasico.nome = nome;
        HardwareBasico.capacidade = capacidade;
    }

    // Métodos
    public static String getNome() {
        return nome;
    }

    public static float getCapacidade() {
        return capacidade;
    }
}
