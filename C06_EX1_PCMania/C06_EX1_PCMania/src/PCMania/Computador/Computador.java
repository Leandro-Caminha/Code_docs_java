// Packages
package PCMania.Computador;

// Imports packages
import PCMania.HardwareBasico.HardwareBasico;
import PCMania.MemoriaUSB.MemoriaUSB;
import PCMania.SistemaOperacional.SistemaOperacional;

public class Computador {

    // Atributos
    private static String marca;
    private static float preco;
    private static HardwareBasico hardwareBasico;
    private static SistemaOperacional sistemaOperacional;

    // Construtor
    public Computador(
            String marca,
            float preco,
            HardwareBasico hardwareBasico,
            SistemaOperacional sistemaOperacional
    )
    {
        Computador.marca = marca;
        Computador.preco = preco;
        Computador.hardwareBasico = hardwareBasico;
        Computador.sistemaOperacional = sistemaOperacional;
    }

    // Métodos
    public void mostrarPCConfigs() {
        System.out.format("Marca: %s%n", Computador.marca);
        System.out.format("Preço: %f%n", Computador.preco);
        System.out.format("Hardware Básico: %s, %f%n", HardwareBasico.getNome(),
                HardwareBasico.getCapacidade()
        );
        System.out.format("Sistema Operacional: %s, %d%n", SistemaOperacional.getNome(),
                SistemaOperacional.getTipo()
        );
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        System.out.format("Memória USB: %s, %d%n", MemoriaUSB.getNome(), MemoriaUSB.getCapacidade());
    }
}
