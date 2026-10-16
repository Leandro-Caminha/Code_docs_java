/*
Exercício 5 – Jogo!
-Crie Classes em Java que atendam a seguinte especificação
-Cada vez que o personagem toma dano ele perde 5 pontos de vida;
-Cada vez que usa a arma, ela perde 2 pontos de resistência

br.inatel.exzumbis.personagem.Personagem:        <>---(Agregação)          br.inatel.exzumbis.arma.Arma:
+nome: string                               +nome: string
+pontos: int                                +poder: int
                                            +resistencia: int
                                            +descriçao: string
--------------------                        ----------------------
+usarArma()                                 +mostratInfoArma()
+tomarDano()

OBS.: Agregação: br.inatel.exzumbis.personagem.Personagem <>--- br.inatel.exzumbis.arma.Arma
 */


// Packages
package br.inatel.exzumbis.main;

// Imports
import br.inatel.exzumbis.arma.Arma;
import br.inatel.exzumbis.personagem.Personagem;

public class Main {
    public static void main(String[] args) {

        Arma arma1 = new Arma();
        arma1.setNome("Faca");
        arma1.setPoder(7);
        arma1.setResistencia(5);
        arma1.setDescricao("Blade mail");

        Arma arma2 = new Arma();
        arma2.setNome("Revolver");
        arma2.setPoder(10);
        arma2.setResistencia(8);
        arma2.setDescricao("Sniper Shoot");

        Personagem personagem1 = new Personagem();
        personagem1.setNome("Leandro");
        personagem1.setPontos(100);
        personagem1.setArma(arma1);

        Personagem personagem2 = new Personagem();
        personagem2.setNome("Lele");
        personagem2.setPontos(100);
        personagem2.setArma(arma2);

        System.out.format("Personagem %s tomou dano.%n", personagem1.getNome());
        personagem1.tomarDano();
        System.out.format("Personagem %s tomou dano com a arma %s.%n%n",
                personagem1.getNome(),
                arma1.getNome()
        );
        personagem1.usarArma();
        personagem1.getArma().mostrarInfoArma();
        System.out.format("Personagem %s tem %d ponto(s).%n%n",
                personagem1.getNome(),
                personagem1.getPontos()
        );

        System.out.format("Personagem %s tomou dano.%n", personagem2.getNome());
        personagem2.tomarDano();
        System.out.format("Personagem %s tomou dano com a arma %s.%n%n",
                personagem2.getNome(),
                arma2.getNome()
        );
        personagem2.usarArma();
        personagem2.getArma().mostrarInfoArma();
        System.out.format("Personagem %s tem %d ponto(s).%n%n",
                personagem2.getNome(),
                personagem2.getPontos()
        );
    }
}