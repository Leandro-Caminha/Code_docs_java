public class Arma {

    String nome;
    int poder;
    int resistencia;
    String descricao;

    public void mostrarInfoArma() {
        System.out.format("Nome da arma: %s%n", nome);
        System.out.format("Poder da arma: %d%n", poder);
        System.out.format("Resistencia da arma: %d%n", resistencia);
        System.out.format("Descricao da arma: %s%n%n", descricao);
    }
}
