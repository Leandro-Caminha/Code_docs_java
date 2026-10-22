/*
Exercício 01 - Leitura e Escrita de Arquivos

Crie um arquivo chamado “professores_disciplina.txt”
Escreva em cada linha o nome do professor + “=” + nome da disciplina.
Exemplo do arquivo:

-> Guilherme=Introducao a Engenharia
-> Ynoguti=Algoritmos
-> Chris=POO
-> Renzao=BD
-> Marcelo=CG
-> Soned=tudo

Depois de criado o arquivo, escreva um programa para ler o arquivo, adicionar o conteúdo em
um HashMap e imprimir o conteúdo do HashMap.
Dicas: Você precisará manipular a classe String para conseguir quebrar uma linha usando um caractere específico como separador. Nesse exemplo é o “=”.
Use o método “split”.
Trate corretamente as Exceptions.

 */


// Packages
package main;

// Imports
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Path arquivo = Paths.get("professores_disciplina.txt");
        try {
            List<String> conteudo = Files.readAllLines(arquivo);
            for (String imprima : conteudo) {
                System.out.println(imprima);
            }
        } catch (IOException erro) {
            System.out.printf("ERRO: Na manipulação do arquivo %s%n",
                    erro.getMessage()
            );
        }
    }
}