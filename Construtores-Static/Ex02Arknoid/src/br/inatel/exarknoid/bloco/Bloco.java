// Packages
package br.inatel.exarknoid.bloco;

public class Bloco {

    // Atributos
    private static int contBlocos = 0;
    private static int contBlocosDestruidos = 0;


    // Construtor
    public Bloco() {
        contBlocos++;
    }

    // Métodos
    public void getContBlocos() {
        System.out.printf("Total de blocos criados: %d%n", contBlocos);
    }

    public void setContBlocosDestruidos() {
        contBlocosDestruidos++;
    }

    public void getContBlocosDestruidos() {
        System.out.printf("Total de blocos destruídos: %d%n", contBlocosDestruidos);
    }
}
