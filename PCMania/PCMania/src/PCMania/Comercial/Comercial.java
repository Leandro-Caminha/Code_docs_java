// Packages
package PCMania.Comercial;

// Imports packages
import PCMania.Clientes.Cliente;
import PCMania.MemoriaUSB.MemoriaUSB;
import PCMania.Promocoes.Promocoes;
import java.util.Scanner;

public class Comercial {

    private static final Scanner input = new Scanner(System.in);

    // Construtor
    public Comercial() {
    }

    // Métodos
    public static void boasVindas() {
        System.out.format("==================================================%n");
        System.out.format("Olá %s%n", Cliente.getNome());
        System.out.format("SEJA BEM VINDO A PCMANIA%n");
        System.out.format("==================================================%n%n");
    }

    public static void instrucaoComprasComputadores() {
        System.out.format("===> INSTRUÇÕES DE COMPRA:%n");
        System.out.format("PARA COMPRAR A PROMOÇÃO 1: Pressione a tecla 1%n");
        System.out.format("PARA COMPRAR A PROMOÇÃO 2: Pressione a tecla 2%n");
        System.out.format("PARA COMPRAR A PROMOÇÃO 3: Pressione a tecla 3%n");
        System.out.format("OBS.: Para FINALIZAR sua compra. Pressione a tecla 0.%n%n");
    }

    public static Promocoes[] escolhaComputador(
            Promocoes promocao1,
            Promocoes promocao2,
            Promocoes promocao3
    )
    {
        // Entrada de dados: Cliente escolhe qual promoção comprar
        int vendas_computador = 0;
        int entrada_computador;
        Promocoes[] compra_realizada = new Promocoes[100];
        int index = 0;

        // Condições de compra de computadores
        do {
            System.out.format("Qual promoção deseja comprar ?%n");
            System.out.format("PROMOÇÃO: ");
            entrada_computador = input.nextInt();

            if (entrada_computador == 0) {
                if (vendas_computador < 2) {
                    System.out.format(
                            "ATENÇÃO: Você deve comprar no mínimo 2 computadores.%n%n");
                }
            } else if (entrada_computador < 1 || entrada_computador > 3) {
                System.out.format("%n");
                System.out.format("===> INSTRUÇÕES DE COMPRA:%n");
                System.out.format("PARA COMPRAR A PROMOÇÃO 1. Pressione a tecla 1%n");
                System.out.format("PARA COMPRAR A PROMOÇÃO 2. Pressione a tecla 2%n");
                System.out.format("PARA COMPRAR A PROMOÇÃO 3. Pressione a tecla 3%n");
                System.out.format("OBS.: Para FINALIZAR a compra. Pressione a tecla 0.%n");
            } else {
                if (entrada_computador == 1) {
                    compra_realizada[index] = promocao1;
                } else if (entrada_computador == 2) {
                    compra_realizada[index] = promocao2;
                } else {
                    compra_realizada[index] = promocao3;
                }
                index++;
                vendas_computador++;
            }
        } while (vendas_computador < 2 || entrada_computador != 0);
        System.out.format("PARABÉNS, COMPUTADOR(S) ESCOLHIDO(S).%n%n");

        // Ajustando o tamanho do array compra_realizada
        Promocoes[] compras_finais = new Promocoes[vendas_computador];

        for (int i = 0; i < vendas_computador; i++) {
            compras_finais[i] = compra_realizada[i];
        }
        compra_realizada = compras_finais;
        return compra_realizada;
    }

    public static void instrucaoCompraMemoriaUSB() {
        System.out.format("===> PARA COMPRA DE MEMÓRIA:%n");
        System.out.format("DA PROMOÇÃO 1: Pressione a tecla 1%n");
        System.out.format("DA PROMOÇÃO 2: Pressione a tecla 2%n");
        System.out.format("DA PROMOÇÃO 3: Pressione a tecla 3%n");
        System.out.format("OBS.: Para FINALIZAR SEM A COMPRA DE MEMÓRIA. Pressione a tecla 0.%n%n");
    }

    public static void escolhaMemoriaUSB(
            Promocoes[] compra_realizada,
            MemoriaUSB memoriaUSB1,
            MemoriaUSB memoriaUSB2,
            MemoriaUSB memoriaUSB3
    )
    {
        for (int i = 0; i < compra_realizada.length; i++) {

            boolean venda_memoriausb = false;
            int entrada_mememoriausb;

            // Entrada de dados: Cliente escolhe se quer memória USB
            do {
                System.out.format("Você deseja comprar memória USB para a compra %d ?%n", i + 1);
                System.out.format("MEMÓRIA DA PROMOÇÃO: ");
                entrada_mememoriausb = input.nextInt();

                // Condições de escolha da memória USB
                if (entrada_mememoriausb < 0 || entrada_mememoriausb > 3) {
                    System.out.format("%n");
                    System.out.format("===> PARA COMPRA DE MEMÓRIA:%n");
                    System.out.format("DA PROMOÇÃO 1: Pressione a tecla 1%n");
                    System.out.format("DA PROMOÇÃO 2: Pressione a tecla 2%n");
                    System.out.format("DA PROMOÇÃO 3: Pressione a tecla 3%n");
                    System.out.format(
                            "OBS.: Para FINALIZAR SEM COMPRAR MEMÓRIA. Pressione a tecla 0.%n%n");
                } else if (entrada_mememoriausb == 0) {
                    System.out.format("PARABÉNS, COMPRA FINALIZADA SEM MEMÓRIA USB.%n%n");
                    venda_memoriausb = true;
                } else {
                    if (entrada_mememoriausb == 1) {
                        compra_realizada[i].getComputador().addMemoriaUSB(memoriaUSB1);
                    } else if (entrada_mememoriausb == 2) {
                        compra_realizada[i].getComputador().addMemoriaUSB(memoriaUSB2);
                    } else {
                        compra_realizada[i].getComputador().addMemoriaUSB(memoriaUSB3);
                    }
                    System.out.format("PARABÉNS, COMPRA FINALIZADA COM MEMÓRIA USB.%n%n");
                    venda_memoriausb = true;
                }
            } while (!venda_memoriausb);
        }
    }

    public static void finalCompra(Promocoes[] compra_realizada) {
        System.out.format("===> COMPRA FINALIZADA COM SUCESSO !!!%n");
        System.out.format("Nome do cliente: %s%n", Cliente.getNome());
        System.out.format("CPF: %s%n%n", Cliente.getCpf());
        System.out.format("===> COMPUTADORES ADQUIRIDOS:%n");

        for (int i = 0; i < compra_realizada.length; i++) {
            compra_realizada[i].getComputador().mostrarPCConfigs();
            System.out.format("%n");
        }
    }

    public static void mostraTotalCompra(float valorTotal) {
        System.out.format("Valor total da compra: R$%.2f%n", valorTotal);
    }

    public static void closeScanner() {
        input.close();
    }
}