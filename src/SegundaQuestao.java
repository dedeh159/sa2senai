import java.util.Locale;
import java.util.Scanner;

public class SegundaQuestao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //definindo vetor de 4 posições
        double[] vet = new double[4];
        //iniciando média em 0
        double media = 0;

        //inserindo todas as posições do vetor e somando os valores na variável média
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o " +(i+1) + " número: ");
            vet[i] = sc.nextDouble();
            media += vet[i];
        }
        //dividinto valor total por 4 para adquirir a média
        media /= vet.length;
        //impressão da média com precisão de duas casas decimáis
        System.out.printf ("Media: %.2f\n",media);
        /*conforme solicitado no exercício, imprimindo positiva para caso a média seja superior a 1
         ou negativa se for de um para baixo, achei estranho pois eu calcularia a média superior a
        zero, mas estou fazendo conforme enunciado.
         */
        if(media > 1) System.out.println("Média positiva");
        else System.out.println("Média negativa");


        sc.close();
    }
}
