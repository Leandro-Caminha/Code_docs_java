// Packages
package PCMania.SistemaOperacional;

public class SistemaOperacional {

    // Atributos
    private final String nome;
    private final int tipo;

    // Construtor
    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // Métodos
    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}
