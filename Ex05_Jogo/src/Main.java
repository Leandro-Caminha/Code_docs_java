/*
Exercício 5 – Jogo!
-Crie Classes em Java que atendam a seguinte especificação
-Cada vez que o personagem toma dano ele perde 5 pontos de vida;
-Cada vez que usa a arma, ela perde 2 pontos de resistência

Personagem:             |    Arma:
+nome: string           |    +nome: string
+pontos: int            |    +poder: int
                        |    +resistencia: int
                        |    +descriçao: string
--------------------    |   ----------------------
+usarArma()             |    +mostratInfoArma()
+tomarDano()            |
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();

        personagem1.nome = "Leandro";
        personagem2.nome = "Lele";

        personagem1.pontos = 100;
        personagem2.pontos = 100;

        Arma arma1 = new Arma();
        Arma arma2 = new Arma();

        arma1.nome = "Faca";
        arma2.nome = "Revolver";

        arma1.poder = 7;
        arma2.poder = 10;

        arma1.resistencia = 5;
        arma2.resistencia = 8;

        arma1.descricao = "Blade mail";
        arma2.descricao = "Sniper Shoot";

        personagem1.arma = arma1;
        personagem2.arma = arma2;

        System.out.format("Personagem %s tomou dano.%n", personagem1.nome);
        personagem1.tomarDano();

        System.out.format("Personagem %s tomou dano com a arma %s.%n%n",
                personagem1.nome,
                arma1.nome
        );
        personagem1.usarArma();
        personagem1.arma.mostrarInfoArma();

        System.out.format("Personagem %s tomou dano.%n", personagem2.nome);
        personagem2.tomarDano();

        System.out.format("Personagem %s tomou dano com a arma %s.%n%n",
                personagem2.nome,
                arma2.nome
        );
        personagem2.usarArma();
        personagem2.arma.mostrarInfoArma();
    }
}