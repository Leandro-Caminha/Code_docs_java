// Packages
package br.inatel.excantina.cantina;

// Imports
import br.inatel.excantina.salgado.Salgado;

public class Cantina {

    // Atributos
    public String nome;
    private final Salgado[] salgados = new Salgado[10];

    // Construtor
    public Cantina(String nome) {
        this.nome = nome;
    }

    // Métodos
    public void addSalgados(Salgado novoSalgado) {
        for(int index = 0; index < salgados.length; index++) {
            if(salgados[index] == null) {
                salgados[index] = novoSalgado;
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.format("A %s possui os seguintes salgados: %n", this.nome);

        for (Salgado salgado : salgados) {
            if(salgado != null)
                System.out.println(salgado.nome);
        }
    }
}