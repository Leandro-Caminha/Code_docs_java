// Packages
package PCMania.Clientes;

public class Cliente {

    // Atributos
    private static String nome = "Leandro Caminha";
    private static String  cpf = "777.777.777-77";

    // Construtor
    public Cliente(String nome, String cpf) {
        Cliente.nome = nome;
        Cliente.cpf = cpf;
    }

    // Métodos
    public static String getNome() {
        return nome;
    }

    public static String getCpf() {
        return cpf;
    }

    public float calculaTotalCompra() {
        return 0;
    }
}
