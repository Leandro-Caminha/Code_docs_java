// Packages
package br.inatel.projectpcmania.computador;

// Imports packages
import br.inatel.projectpcmania.hardwarebasico.HardwareBasico;
import br.inatel.projectpcmania.memoriausab.MemoriaUSB;
import br.inatel.projectpcmania.sistemaoperacional.SistemaOperacional;

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
            String nome_hardware,
            float capacidade_hardware,
            String nome_os,
            int tipo_os
    )
    {
        this.marca = marca;
        this.preco = preco;
        this.hardwareBasico = new HardwareBasico(nome_hardware, capacidade_hardware);
        this.sistemaOperacional = new SistemaOperacional(nome_os,tipo_os);
    }

    // Métodos
    public float getPreco() {
        return preco;
    }

    public void mostrarPCConfigs() {
        System.out.printf("Marca: %s%n", this.marca);
        System.out.printf("Preço: R$%.2f%n", this.preco);
        System.out.printf("Hardware Básico: %s, %.1f(Mhz/Gb)%n",
                hardwareBasico.getNome(),
                hardwareBasico.getCapacidade()
        );
        System.out.printf("Sistema Operacional: %s, %d(bits)%n",
                sistemaOperacional.getNome(),
                sistemaOperacional.getTipo()
        );
        if (memoriaUSB != null) {
            System.out.printf("Memória USB: %s, %d(Mhz/Gb)%n",
                    memoriaUSB.getNome(),
                    memoriaUSB.getCapacidade()
            );
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }
}
