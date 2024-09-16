import java.util.Scanner;

public class QuintaQuestao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //lendo o tamanho da lista
        System.out.println("Quantos itens deseja incluir na lista? ");
        int n = sc.nextInt();
        int[] lista = new int[n];
        //percorrendo e preenchendo o vetor
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i+1)+"º valor da lista: ");
            lista[i] = sc.nextInt();
        }
        //chamando a função para efetuar a impressão da lista com sua posição.
        imprimirLista(lista);
    }

    //metodo para impressão do vetor
    public static void imprimirLista(int[] lista){
        System.out.println("Imprimindo valores da lista: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.println((i+1)+"º Valor da lista: "+lista[i]);
        }
    }
}
