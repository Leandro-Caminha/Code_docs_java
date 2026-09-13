// Packages
package PCMania.Computador;

// Imports packages
import PCMania.HardwareBasico.HardwareBasico;
import PCMania.MemoriaUSB.MemoriaUSB;
import PCMania.SistemaOperacional.SistemaOperacional;

public class Computador {

    // Atributos
    private final String marca;
    private final float preco;
    private final HardwareBasico hardwareBasico;
    private final SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoriaUSB;

    // Construtor
    public Computador(
            String marca,
            float preco,
            String nome_hw,
            float capacidade_hw,
            String nome_os,
            int tipo_os
    )
    {
        this.marca = marca;
        this.preco = preco;
        this.hardwareBasico = new HardwareBasico(nome_hw,capacidade_hw);
        this.sistemaOperacional = new SistemaOperacional(nome_os,tipo_os);
    }

    // Métodos
    public float getPreco() {
        return preco;
    }

    public void mostrarPCConfigs() {
        System.out.format("Marca: %s%n", this.marca);
        System.out.format("Preço: R$%.2f%n", this.preco);
        System.out.format("Hardware Básico: %s, %.1f%n", hardwareBasico.getNome(),
                hardwareBasico.getCapacidade()
        );
        System.out.format("Sistema Operacional: %s, %d%n", sistemaOperacional.getNome(),
                sistemaOperacional.getTipo()
        );
        if (memoriaUSB != null) {
            System.out.format("Memória USB: %s, %d%n",
                    memoriaUSB.getNome(),
                    memoriaUSB.getCapacidade()
            );
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }
}
