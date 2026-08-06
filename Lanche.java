import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero de lanches:");
        int lanche1 = entrada.nextInt();
        System.out.println("Digite o numero de lanches:");
        int lanche2 = entrada.nextInt();
        System.out.println("Digite o numero de lanches:");
        int lanche3 = entrada.nextInt();

        int soma = lanche1 + lanche2 + lanche3;
        int media = soma / 3;

        System.out.println("O Número total de lanches = " + soma);
        System.out.println("A média de lanches = " + media);

        entrada.close();
    }
}
