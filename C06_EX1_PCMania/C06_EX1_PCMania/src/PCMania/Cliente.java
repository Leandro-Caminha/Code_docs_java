package PCMania;

public class Cliente {

    private String nome;
    private String  cpf;

    public Cliente(String nome, String cpf) {
        this.nome = "Leandro Caminha";
        this.cpf = "777.777.777-77";
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public float calculaTotalCompra() {
        return 0;
    }
}
