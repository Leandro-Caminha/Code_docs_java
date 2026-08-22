public class Personagem {

    String nome;
    int pontos;
    Arma arma;

    public void tomarDano() {
            pontos -= 5;
    }

    public void usarArma() {
            arma.resistencia -= 2;
    }
}
