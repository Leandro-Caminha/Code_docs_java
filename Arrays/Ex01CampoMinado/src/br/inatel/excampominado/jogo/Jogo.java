//Packages
package br.inatel.excampominado.jogo;

// Imports
import br.inatel.excampominado.campominado.CampoMinado;
import br.inatel.excampominado.jogador.Jogador;
import java.util.Scanner;

public class Jogo {

    // Atributos
    private final CampoMinado campo;
    private final Jogador jogador;

    // Construtor
    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        campo = new CampoMinado();
    }

    // Métodos
    public void iniciarJogo() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do jogador: ");
        String nomeJogador = entrada.nextLine();
        jogador.setNome(nomeJogador);

        boolean[][] posicoesVisitadas = new boolean[2][2];

        int quantidadePosicoesVisitadas = 0;

        System.out.format("================================%n");
        System.out.format("===     CAMPO MINADO 2x2     ===%n");
        System.out.format("================================%n");
        System.out.printf("Jogador: %s%n", jogador.getNome());

        while (quantidadePosicoesVisitadas < 4) {
            int linha;
            int coluna;

            do {
                System.out.print("Digite a linha (0 ou 1): ");
                linha = entrada.nextInt();
                if (linha != 0 && linha != 1) {
                    System.out.println("Linha inválida! Digite somente 0 ou 1.");
                }
            } while (linha != 0 && linha != 1);

            do {
                System.out.print("Digite a coluna (0 ou 1): ");
                coluna = entrada.nextInt();
                if (coluna != 0 && coluna != 1) {
                    System.out.println("Coluna inválida! Digite somente 0 ou 1.");
                }
            } while (coluna != 0 && coluna != 1);

            if (posicoesVisitadas[linha][coluna]) {
                System.out.println("Você já verificou essa posição!");
                continue;
            } else {
                posicoesVisitadas[linha][coluna] = true;

                quantidadePosicoesVisitadas++;

                if (campo.possuiBomba(linha, coluna)) {
                    System.out.printf(campo.getMensagem(1), "%n");
                } else {
                    System.out.printf(campo.getMensagem(0), "%n");
                }
            }

            System.out.printf("Posições visitadas: %d/4%n", quantidadePosicoesVisitadas);
        }

        System.out.println("================================");
        System.out.println("=== CAMPO MINADO PERCORRIDO! ===");
        System.out.println("================================");

        entrada.close();
    }
}