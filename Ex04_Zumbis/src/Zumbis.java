public class Zumbis {
    
    String nome;
    double vida;

    public double mostrarVida() {
        return vida;
    }

    public boolean transfereVida(Zumbis zumbiAlvo, double quantia) {
        if (vida >= quantia) {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            System.out.println("***VIDA TRANSFERIDA COM SUCESSO***");
            return true;
        }
        else {
            System.out.println("***VIDA INSUFICIENTE***");
            return false;
        }
    }
}
