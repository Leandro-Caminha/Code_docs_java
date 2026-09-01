import java.util.Scanner;

public class Jogo {

    private CampoMinado campo;
    private Jogador jogador;

    public Jogo(Jogador jogador) {

        // Recebendo o objeto da classe Jogador
        this.jogador = jogador;

        // Criando o objeto da classe CampoMinado na classe Jogo
        campo = new CampoMinado();
    }

    public void iniciarJogo() {

        Scanner entrada = new Scanner(System.in);

        // Entrada de dados: Nome do jogador
        System.out.print("Digite o nome do jogador: ");
        String nomeJogador = entrada.nextLine();
        jogador.setNome(nomeJogador);

        // Matriz para controlar as posições já escolhidas
        boolean[][] posicoesVisitadas = new boolean[2][2];

        // Contador de posições visitadas no jogo
        int quantidadePosicoesVisitadas = 0;

        // Saída de dados: Início do jogo
        System.out.println("================================");
        System.out.println("===     CAMPO MINADO 2x2     ===");
        System.out.println("================================");

        System.out.println("Jogador: " + jogador.getNome());

        // Verificação das condições do jogo
        while (quantidadePosicoesVisitadas < 4) {

            int linha;
            int coluna;

            // Entrada e verificação de dados: linha
            do {
                System.out.print("Digite a linha (0 ou 1): ");
                linha = entrada.nextInt();
                if (linha != 0 && linha != 1) {
                    System.out.println("Linha inválida! Digite somente 0 ou 1.");
                }
            } while (linha != 0 && linha != 1);

            // Entrada e verificação de dados: Coluna
            do {
                System.out.print("Digite a coluna (0 ou 1): ");
                coluna = entrada.nextInt();
                if (coluna != 0 && coluna != 1) {
                    System.out.println("Coluna inválida! Digite somente 0 ou 1.");
                }
            } while (coluna != 0 && coluna != 1);

            // Verifica se a posição já foi escolhida
            if (posicoesVisitadas[linha][coluna]) {
                System.out.println("Você já verificou essa posição!");
                continue;

            } else {
                // Marca a posição como visitada
                posicoesVisitadas[linha][coluna] = true;

                // Incrementa a quantidade de posições visitadas
                quantidadePosicoesVisitadas++;

                // Verifica se encontrou a bomba
                if (campo.possuiBomba(linha, coluna)) {
                    System.out.println(campo.getMensagem(1));
                } else {
                    System.out.println(campo.getMensagem(0));
                }
            }

            // Saída de dados: Informa quantidade de posições visitadas matriz(2x2)
            System.out.println("Posições visitadas: " + quantidadePosicoesVisitadas + "/4");
            System.out.println();
        }

        // Saída de dados: Fim do jogo
        System.out.println("================================");
        System.out.println("=== CAMPO MINADO PERCORRIDO! ===");
        System.out.println("================================");

        entrada.close();
    }
}