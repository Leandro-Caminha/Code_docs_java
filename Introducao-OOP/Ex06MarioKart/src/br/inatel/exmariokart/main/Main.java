/*
Exercício 6 – Mario br.inatel.exmariokart.kart.Kart!
Crie Classes em Java que atendam a especificação UML abaixo;
Em seguida crie ao menos dois objetos de cada, os relacione;
Os métodos devem apenas imprimir suas ações;
As cilindradas podem assumir três valores: 50, 100 e 150;
A velocidade pode assumir valores entre 0 e 150;

br.inatel.exmariokart.piloto.Piloto       ---<> (Agregação)     br.inatel.exmariokart.kart.Kart     <>---(Composição)      br.inatel.exmariokart.motor.Motor
+nome: String                      +nome: String                   +cilindradas: String
+vilão: boolean                                                    +velocidadeMaxima: float
------------------                 ------------------              ---------------------------
+soltaSuperPoder()                 +pular()                        +mostarInfo()
                                   +soltarTurbo()
                                   +fazerDrift()

OBS.:Agregação: br.inatel.exmariokart.piloto.Piloto ---<> br.inatel.exmariokart.kart.Kart
      Composição: br.inatel.exmariokart.kart.Kart <>--- br.inatel.exmariokart.motor.Motor
 */


// Packages
package br.inatel.exmariokart.main;

// Imports
import br.inatel.exmariokart.kart.Kart;
import br.inatel.exmariokart.piloto.Piloto;

public class Main {
    public static void main(String[] args) {

        Piloto piloto1 = new Piloto();
        piloto1.setNome("Piloto1");

        Piloto piloto2 = new Piloto();
        piloto2.setNome("Piloto2");

        Kart kart1 = new Kart();
        kart1.setNome("Kart1");
        kart1.setMotor(). = "150";
        kart1.motor.velocidadeMaxima = 95.20f;
        kart1.piloto = piloto1;

        Kart kart2 = new Kart();
        kart2.nome = "Kart2";
        kart2.motor.cilindradas = "50";
        kart2.motor.velocidadeMaxima = 76.10f;
        kart2.piloto = piloto2;

        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        kart1.fazerDrift();
        kart1.motor.mostraInfo();

        kart2.soltarTurbo();
        kart2.motor.mostraInfo();
    }
}