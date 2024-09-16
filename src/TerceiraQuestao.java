import java.util.Scanner;

public class TerceiraQuestao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //definindo vetor de 20 posições
        int[] vet = new int[20];
        //variável média para calcular a média da soma de todos os vetores
        double media = 0;
        //variável para armazenar maior e menor número do vetor
        int maior = 0, menor = 0;
        //estrutura para preencher vetor, e somar todas as casas em uma variável
        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o " + (i+1) +" valor: ");
            vet[i] = sc.nextInt();
            media += vet[i];
            //iniciando maior e menor com qualquer numero inserido no vetor pois caso eu inicie
            //o mesmo em zero, ele será menor que qualquer número  positivo inserido dentro do vetor
            maior = vet[i];
            menor = vet[i];
        }
        //definindo maior e menor número do vetor
        for (int i = 0; i < vet.length; i++) {
            if (maior < vet[i]) maior = vet[i];
            if (menor > vet[i]) menor = vet[i];
        }
        media = media / 20;

        //impressão dos resultados

        System.out.println("Maior número do vetor: " + maior);
        System.out.println("Menor número do vetor: " + menor);
        System.out.printf("Média do vetor: %.2f\n", media);

        sc.close();
    }
}
