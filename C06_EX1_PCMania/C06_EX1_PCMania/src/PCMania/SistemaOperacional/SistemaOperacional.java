// Packages
package PCMania.SistemaOperacional;

public class SistemaOperacional {

    // Atributos
    private static String nome;
    private static int tipo;

    // Construtor
    public SistemaOperacional(String nome, int tipo) {
        SistemaOperacional.nome = nome;
        SistemaOperacional.tipo = tipo;
    }

    // Métodos
    public static String getNome() {
        return nome;
    }

    public static int getTipo() {
        return tipo;
    }
}
