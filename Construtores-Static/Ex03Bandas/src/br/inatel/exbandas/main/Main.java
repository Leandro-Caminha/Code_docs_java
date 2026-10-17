/*
Exercício 03 - Bandas
Crie classes em Java que atendam as especificações UML abaixo
Em seguida crie uma banda, com alguns membros, algumas músicas, um empresário e mostre essas informações

Especificação UML:
 *
 * CLASSE Empresario
 *   Atributos:
 *     - nome: String
 *     - cnpj: long
 *   Métodos:
 *     + Empresario(String nome, long cnpj)    // construtor
 *
 * CLASSE Banda
 *   Atributos:
 *     - nome: String
 *     - genero: String
 *   Métodos:
 *     + mostraInfo()
 *     + addMusicaNova(Musica musica)
 *     + addMembroNovo(Membro membro)
 *     + Banda(String nome, String genero)     // construtor
 *
 * CLASSE Membro
 *   Atributos:
 *     - nome: String
 *     - funcao: String
 *   Métodos:
 *     + Membro(String nome, String funcao)    // construtor
 *
 * CLASSE Musica
 *   Atributos:
 *     - nome: String
 *     - duracao: double
 *   Métodos:
 *     + Musica(String nome, double duracao)   // construtor
 *
 * RELACIONAMENTOS (agregação, losango do lado da Banda):
 *   - Banda possui 0..1 Empresario
 *       (uma banda pode ter no máximo um empresário)
 *   - Banda possui 1..* Membro
 *       (uma banda tem pelo menos um membro)
 *   - Banda possui 1..* Musica
 *       (uma banda tem pelo menos uma música)
 *
 * LEGENDA DE VISIBILIDADE:
 *   "-" = private
 *   "+" = public
 *
 * TAREFA:
 *   1) Criar as classes em Java conforme o UML acima.
 *   2) Criar uma banda com alguns membros, algumas músicas
 *      e um empresário, e mostrar essas informações.
 */


// Packages
package br.inatel.exbandas.main;

public class Main {
    public static void main(String[] args) {

        }
    }