public class Zumbis {

    double vida;
    String nome;

    public double mostrarVida() {
        return vida;
    }

    public void transfereVida(Zumbis zumbiAlvo, double quantia) {
        vida -= quantia;
        zumbiAlvo.vida += quantia;
    }
}