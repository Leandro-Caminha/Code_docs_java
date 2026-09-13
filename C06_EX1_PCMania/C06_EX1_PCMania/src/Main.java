// Imports packages
import PCMania.Clientes.Cliente;
import PCMania.Comercial.Comercial;
import PCMania.Computador.Computador;
import PCMania.MemoriaUSB.MemoriaUSB;
import PCMania.Promocoes.Promocoes;
import PCMania.ProcessoPedido.ProcessarPedido;

public class Main {
    public static void main(String[] args) {

        // Criando objetos da classe Computador
        Computador computador1 = new Computador(
                "Apple", 9825f,
                "Pentium Core i5, HD",
                500f,
                "macOS Sequoia",
                64
        );
        Computador computador2 = new Computador(
                "Sansung",
                9826f,
                "Pentium Core i7, HD",
                1f,
                "Windows 8",
                64
        );
        Computador computador3 = new Computador(
                "Dell",
                9827f,
                "Pentium Core i7, HD",
                2f,
                "Windows 10",
                64
        );

        // Criando objetos da classe MemoriaUSB
        MemoriaUSB memoriaUSB1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB memoriaUSB2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB memoriaUSB3 = new MemoriaUSB("HD Externo", 1);

        // Criando objetos da classe Promocoes
        Promocoes promocao1 = new Promocoes(computador1);
        Promocoes promocao2 = new Promocoes(computador2);
        Promocoes promocao3 = new Promocoes(computador3);

        // Mensagem de boas-vindas ao cliente
        Comercial.boasVindas();

        // Instruções de compra de computador(s)
        Comercial.instrucaoComprasComputadores();

        // Escolha da compra de computador(s)
        Promocoes[] compra_realizada = Comercial.escolhaComputador(
                promocao1,
                promocao2,
                promocao3
        );

        // Instruções da compra de memória USB
        Comercial.instrucaoCompraMemoriaUSB();

        // Escolha da compra de memória USB
        Comercial.escolhaMemoriaUSB(
                compra_realizada,
                memoriaUSB1,
                memoriaUSB2,
                memoriaUSB3
        );

        // Mensagem do final da compra
        Comercial.finalcompra(compra_realizada);

        // Converte o objeto Promocoes compra_realizada e um objeto Cliente compra_realizada_total
        Cliente.setCompraRealizada(compra_realizada);

        // Cálcula o valor total da compra
        Cliente.calculaTotalCompra();

        // Mostra o valor total da compra
        Comercial.mostraTotalCompra(Cliente.calculaTotalCompra());

        // Informação final do pedido
        ProcessarPedido.pedidoenviado(compra_realizada);

        // Fecha o input utilizado pelo system.in na classe Comercial
        Comercial.closeScanner();
    }
}