// Packages
package PCMania.Comercial;

// Imports packages
import PCMania.Clientes.Cliente;
import java.util.Scanner;

public class Comercial {

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

    public static void escolhaComputador() {

        // Criando um objeto da classe Scanner
        Scanner input = new Scanner(System.in);
        int vendas_computador = 0;
        int entrada_computador;

        // Entrada de dados do cliente
        System.out.format("Qual promoção deseja comprar ?%n");
        System.out.format("PROMOÇÃO: ");
        entrada_computador = input.nextInt();

        // Condições de compra de computadores
        while (vendas_computador < 2) {
            if (entrada_computador == 0) {
                System.out.format(
                        "ATENÇÃO: Você deve comprar no mínimo 2 computadores.%n%n");
            } else if (entrada_computador < 0 || entrada_computador > 3) {
                System.out.format("%n");
                System.out.format("===> INSTRUÇÕES DE COMPRA:%n");
                System.out.format("PARA COMPRAR A PROMOÇÃO 1. Pressione a tecla 1%n");
                System.out.format("PARA COMPRAR A PROMOÇÃO 2. Pressione a tecla 2%n");
                System.out.format("PARA COMPRAR A PROMOÇÃO 3. Pressione a tecla 3%n");
                System.out.format(
                        "OBS.: Para FINALIZAR a compra. Pressione a tecla 0.%n%n");
            } else {
                vendas_computador++;
            }
            System.out.format("Qual promoção deseja comprar ?%n");
            System.out.format("PROMOÇÃO: ");
            entrada_computador = input.nextInt();
        }

        if (entrada_computador == 0) {
            System.out.format("PARABÉNS, COMPUTADOR(S) ESCOLHIDO(S).%n%n");
        } else {
            do {
                System.out.format("Qual promoção deseja comprar ?%n");
                System.out.format("PROMOÇÃO: ");
                entrada_computador = input.nextInt();
                if (entrada_computador < 0 || entrada_computador > 3) {
                    System.out.format("%n");
                    System.out.format("===> INSTRUÇÕES DE COMPRA:%n");
                    System.out.format("PARA COMPRAR A PROMOÇÃO 1. Pressione a tecla 1%n");
                    System.out.format("PARA COMPRAR A PROMOÇÃO 2. Pressione a tecla 2%n");
                    System.out.format("PARA COMPRAR A PROMOÇÃO 3. Pressione a tecla 3%n");
                    System.out.format("OBS.: Para FINALIZAR a compra. Pressione a tecla 0.%n");
                }
            } while (entrada_computador != 0);
            System.out.format("PARABÉNS, COMPUTADOR(S) ESCOLHIDO(S).%n%n");
            input.close();
        }
    }

    public static void instrucaoCompraMemoriaUSB() {
        System.out.format("===> Você deseja comprar memória USB ?%n");
        System.out.format("===> PARA COMPRA DE MEMÓRIA:%n");
        System.out.format("DA PROMOÇÃO 1: Pressione a tecla 1%n");
        System.out.format("DA PROMOÇÃO 2: Pressione a tecla 2%n");
        System.out.format("DA PROMOÇÃO 3: Pressione a tecla 3%n");
        System.out.format("OBS.: Para FINALIZAR SEM A COMPRA DE MEMÓRIA. Pressione a tecla 0.%n%n");
    }

    public static void escolhaMemoriaUSB() {

        // Criando um objeto da classe Scanner
        Scanner input = new Scanner(System.in);
        boolean venda_memoriausb = false;
        int entrada_mememoriausb;

        // Condições de compra da Memórias USB
        do {
            System.out.format("Você deseja comprar memória USB ?%n");
            System.out.format("MEMÓRIA DA PROMOÇÃO: ");
            entrada_mememoriausb = input.nextInt();
            if (entrada_mememoriausb < 0 || entrada_mememoriausb > 3) {
                System.out.format("%n");
                System.out.format("===> PARA COMPRA DE MEMÓRIA:%n");
                System.out.format("DA PROMOÇÃO 1: Pressione a tecla 1%n");
                System.out.format("DA PROMOÇÃO 2: Pressione a tecla 2%n");
                System.out.format("DA PROMOÇÃO 3: Pressione a tecla 3%n");
                System.out.format("OBS.: Para FINALIZAR SEM COMPRAR MEMÓRIA. Pressione a tecla 0.%n%n");
            } else if (entrada_mememoriausb == 0) {
                System.out.format("PARABÉNS, COMPRA FINALIZADA SEM MEMÓRIA USB.%n%n");
                venda_memoriausb = true;
            } else {
                System.out.format("PARABÉNS, COMPRA FINALIZADA COM MEMÓRIA USB.%n%n");
                venda_memoriausb = true;
            }
        } while (!venda_memoriausb);
        input.close();
    }
}