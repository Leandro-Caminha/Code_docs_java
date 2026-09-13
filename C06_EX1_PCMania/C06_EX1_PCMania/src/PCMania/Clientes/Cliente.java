// Packages
package PCMania.Clientes;

// Imports packages
import PCMania.Promocoes.Promocoes;

public class Cliente {

    // Atributos
    private static String nome = "Leandro Caminha";
    private static String  cpf = "777.777.777-77";
    private static Promocoes[] compra_realizada_total;

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

    public static void setCompraRealizada(Promocoes[] compra_realizada_total) {
        Cliente.compra_realizada_total = compra_realizada_total;
    }

    public static float calculaTotalCompra() {

        float valorTotal = 0;

        for (int i = 0; i < Cliente.compra_realizada_total.length; i++) {
            valorTotal += Cliente.compra_realizada_total[i].getComputador().getPreco();
        }
        return valorTotal;
    }
}
