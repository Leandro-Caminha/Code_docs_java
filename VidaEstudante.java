import java.util.Scanner;

public class VidaEstudante {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota da NP1: ");
        float value1 = input.nextFloat();
        System.out.print("Digite a nota da NP2: ");
        float value2 = input.nextFloat();

        float ret = value1 + value2;

        if(ret < 30){
            System.out.println("ALUNO REPROVADO");
        }else if(ret >= 30 && ret < 60){
            System.out.println("NP1 + NP2 = " + ret);
            System.out.println("O ALUNO DEVE FAZER A NP3");
            System.out.print("Digite a nota da NP3: ");
            float value3 = input.nextFloat();
            ret = (ret + value3) / 2;
            if(ret < 50){
                System.out.println("ALUNO REPROVADO");
            }else{
                System.out.println("ALUNO APROVADO");
            }
        }else{
            System.out.println("ALUNO APROVADO");
        }
        input.close();
    }
}