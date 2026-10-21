// Packages
package br.inatel.exbandas.banda;

// Imports
import br.inatel.exbandas.empresario.Empresario;
import br.inatel.exbandas.membro.Membro;
import br.inatel.exbandas.musica.Musica;

public class Banda {

    // Atributos
    private final String nome;
    private final String genero;
    private Empresario empresario;
    private final Membro[] membro = new Membro[3];
    private final Musica[] musica = new Musica[3];

    // Construtor
    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    // Setters
    public void setEmpresario(Empresario empresario) {
        this.empresario = empresario;
    }

    // Métodos
    public void addMusicaNova(Musica musica){
        for (int index = 0; index < this.musica.length; index++ ) {
            if(this.musica[index] == null) {
                this.musica[index] = musica;
                break;
            }
        }
    }

    public void addMembroNovo(Membro membro){
        for (int index = 0; index < this.membro.length; index++ ) {
            if(this.membro[index] == null) {
                this.membro[index] = membro;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.printf("Nome da banda: %s", this.nome);
        System.out.printf("Gênero da banda: %s", this.genero);
        System.out.printf("Nome do membro da banda: %s", this.membro);

    }
}
