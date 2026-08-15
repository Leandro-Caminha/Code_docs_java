public class Main {
    public static void main(String[] args) {

        // Instanciando obejetos da classe Zumbis
        Zumbis zumbi_1 = new Zumbis();
        zumbi_1.nome = "Leandro";
        zumbi_1.vida = 180;

        Zumbis zumbi_2 = new Zumbis();
        zumbi_2.nome = "Lele";
        zumbi_2.vida = 150;

        // Saída de dados da vida dos zumbis criados
        System.out.format("Vida do zumbi %s = %.2f%n",
                zumbi_1.nome,
                zumbi_1.mostrarVida());
        System.out.format("Vida do zumbi %s = %.2f%n%n",
                zumbi_2.nome,
                zumbi_2.mostrarVida());

        // Alterando a vida dos zumbis pelo método transfereVida
        zumbi_1.transfereVida(zumbi_2, 85);

        // Saída de dados das vidas alteradas
        System.out.format("Vida do zumbi %s = %.2f%n",
                zumbi_1.nome,
                zumbi_1.mostrarVida());
        System.out.format("Vida do zumbi %s = %.2f%n%n",
                zumbi_2.nome,
                zumbi_2.mostrarVida());

        // Igualando as referências dos obejtos criados
        zumbi_1 = zumbi_2;

        // Saídas de dados das referências igualadas
        System.out.format("Vida do zumbi %s = %.2f%n",
                zumbi_1.nome,
                zumbi_1.mostrarVida());
        System.out.format("Vida do zumbi %s = %.2f%n",
                zumbi_2.nome,
                zumbi_2.mostrarVida());
    }
}
