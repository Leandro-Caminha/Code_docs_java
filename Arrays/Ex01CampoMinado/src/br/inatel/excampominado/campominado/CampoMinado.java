// Packages
package br.inatel.excampominado.campominado;

// Imports
import br.inatel.excampominado.bomba.Bomba;
import java.util.Random;

public class CampoMinado {

    // Atributos
    private boolean[][] campo;
    private final Bomba bomba;
    private final String[] mensagens;

    // Construtor
    public CampoMinado() {
        campo = new boolean[2][2];
        mensagens = new String[2];
        mensagens[0] = "Você está seguro! Continue jogando!";
        mensagens[1] = "Bomba descoberta! EXPLODIU... Continue jogando!";

        Random random = new Random();

        int linha = random.nextInt(2);
        int coluna = random.nextInt(2);

        bomba = new Bomba(linha, coluna);
    }

    // Métodos
    public boolean possuiBomba(int linha, int coluna) {
        return linha == bomba.getLinha() && coluna == bomba.getColuna();
    }

    public String getMensagem(int indice) {
        return mensagens[indice];
    }
}