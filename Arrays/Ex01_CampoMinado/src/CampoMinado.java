import java.util.Random;

public class CampoMinado {

    private boolean[][] campo;
    private Bomba bomba;
    private String[] mensagens;

    public CampoMinado() {

        campo = new boolean[2][2];
        mensagens = new String[2];
        mensagens[0] = "Você está seguro! Continue jogando!";
        mensagens[1] = "Bomba descoberta! EXPLODIU... Continue jogando!";

        // Criando o objeto da classe Random
        Random random = new Random();
        int linha = random.nextInt(2);
        int coluna = random.nextInt(2);

        // Criando o objeto da classe Bomba na classe CampoMinado
        bomba = new Bomba(linha, coluna);
    }

    public boolean possuiBomba(int linha, int coluna) {
        return linha == bomba.getLinha() && coluna == bomba.getColuna();
    }

    public String getMensagem(int indice) {
        return mensagens[indice];
    }
}