// Packages
package br.inatel.projectpcmania.comercial;

// Imports packages
import br.inatel.projectpcmania.clientes.Cliente;
import br.inatel.projectpcmania.memoriausab.MemoriaUSB;
import br.inatel.projectpcmania.promocoes.Promocoes;
import java.util.Scanner;

public class Comercial {

    private static final Scanner input = new Scanner(System.in);

    // Construtor
    public Comercial() {
    }

    // Métodos
    public static void boasVindas() {
        System.out.println("==================================================");
        System.out.printf("Olá %s%n", Cliente.getNome());
        System.out.printf("SEJA BEM VINDO A PCMANIA%n");
        System.out.println("==================================================%n");
    }

    public static void instrucaoComprasComputadores() {
        System.out.println("===> INSTRUÇÕES DE COMPRA:");
        System.out.println("PARA COMPRAR A PROMOÇÃO 1: Pressione a tecla 1");
        System.out.println("PARA COMPRAR A PROMOÇÃO 2: Pressione a tecla 2");
        System.out.println("PARA COMPRAR A PROMOÇÃO 3: Pressione a tecla 3");
        System.out.println("OBS.: Para FINALIZAR sua compra. Pressione a tecla 0.%n");
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
            System.out.println("Qual promoção deseja comprar ?");
            System.out.print("PROMOÇÃO: ");
            entrada_computador = input.nextInt();

            if (entrada_computador == 0) {
                if (vendas_computador < 2) {
                    System.out.println("ATENÇÃO: Você deve comprar no mínimo 2 computadores.%n%n");
                }
            } else if (entrada_computador < 1 || entrada_computador > 3) {
                System.out.println("===> INSTRUÇÕES DE COMPRA:");
                System.out.println("PARA COMPRAR A PROMOÇÃO 1. Pressione a tecla 1");
                System.out.println("PARA COMPRAR A PROMOÇÃO 2. Pressione a tecla 2");
                System.out.println("PARA COMPRAR A PROMOÇÃO 3. Pressione a tecla 3");
                System.out.println("OBS.: Para FINALIZAR a compra. Pressione a tecla 0.");
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
        System.out.println("PARABÉNS, COMPUTADOR(S) ESCOLHIDO(S).%n");

        // Ajustando o tamanho do array compra_realizada
        Promocoes[] compras_finais = new Promocoes[vendas_computador];

        for (int i = 0; i < vendas_computador; i++) {
            compras_finais[i] = compra_realizada[i];
        }
        compra_realizada = compras_finais;
        return compra_realizada;
    }

    public static void instrucaoCompraMemoriaUSB() {
        System.out.println("===> PARA COMPRA DE MEMÓRIA:");
        System.out.println("DA PROMOÇÃO 1: Pressione a tecla 1");
        System.out.println("DA PROMOÇÃO 2: Pressione a tecla 2");
        System.out.println("DA PROMOÇÃO 3: Pressione a tecla 3");
        System.out.println("OBS.: Para FINALIZAR SEM A COMPRA DE MEMÓRIA. Pressione a tecla 0.%n");
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
                System.out.printf("Você deseja comprar memória USB para a compra %d ?%n", i + 1);
                System.out.print("MEMÓRIA DA PROMOÇÃO: ");
                entrada_mememoriausb = input.nextInt();

                // Condições de escolha da memória USB
                if (entrada_mememoriausb < 0 || entrada_mememoriausb > 3) {
                    System.out.println();
                    System.out.println("===> PARA COMPRA DE MEMÓRIA:");
                    System.out.println("DA PROMOÇÃO 1: Pressione a tecla 1");
                    System.out.println("DA PROMOÇÃO 2: Pressione a tecla 2");
                    System.out.println("DA PROMOÇÃO 3: Pressione a tecla 3");
                    System.out.println(
                            "OBS.: Para FINALIZAR SEM COMPRAR MEMÓRIA. Pressione a tecla 0.%n");
                } else if (entrada_mememoriausb == 0) {
                    System.out.println("PARABÉNS, COMPRA FINALIZADA SEM MEMÓRIA USB.%n");
                    venda_memoriausb = true;
                } else {
                    if (entrada_mememoriausb == 1) {
                        compra_realizada[i].getComputador().addMemoriaUSB(memoriaUSB1);
                    } else if (entrada_mememoriausb == 2) {
                        compra_realizada[i].getComputador().addMemoriaUSB(memoriaUSB2);
                    } else {
                        compra_realizada[i].getComputador().addMemoriaUSB(memoriaUSB3);
                    }
                    System.out.println("PARABÉNS, COMPRA FINALIZADA COM MEMÓRIA USB.%n");
                    venda_memoriausb = true;
                }
            } while (!venda_memoriausb);
        }
    }

    public static void finalCompra(Promocoes[] compra_realizada) {
        System.out.println("===> COMPRA FINALIZADA COM SUCESSO !!!");
        System.out.printf("Nome do cliente: %s%n", Cliente.getNome());
        System.out.printf("CPF: %s%n%n", Cliente.getCpf());
        System.out.println("===> COMPUTADORES ADQUIRIDOS:");

        for (int i = 0; i < compra_realizada.length; i++) {
            compra_realizada[i].getComputador().mostrarPCConfigs();
            System.out.format("%n");
        }
    }

    public static void mostraTotalCompra(float valorTotal) {
        System.out.printf("Valor total da compra: R$%.2f%n", valorTotal);
    }

    public static void closeScanner() {
        input.close();
    }
}