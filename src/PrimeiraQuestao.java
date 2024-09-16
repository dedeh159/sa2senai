public class PrimeiraQuestao {
    public static void main(String[] args) {

         /*1. Dada a lista L = [5, 7, 2, 9, 4, 1, 3], escreva um programa que
         imprima as seguintes informações:
          */
        int[] lista = {5, 7, 2, 9, 4, 1, 3};
        //a) tamanho da lista;
        System.out.println("O tamanho da lista é de " + lista.length);

        //encontrando o maior e o menor valor da lista e somanto os itens
        int soma = 0;
        int maior = lista[0];
        int menor = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (maior < lista[i]) maior = lista[i];
            if (menor > lista[i]) menor = lista[i];
            soma += lista[i];
        }
        System.out.println("Maior valor  = " + maior);
        System.out.println("Menor valor  = " + menor);
        System.out.println("Soma dos valores  = " + soma);

        //ordenando a lista em ordem crescente com ordenação do vetor
            int n = lista.length;


            // Repetição para cada elemento do vetor
            for (int i = 0; i < n - 1; i++) {


                // Comparar elementos
                for (int j = 0; j < n - i - 1; j++) {
                    if (lista[j] > lista[j + 1]) {
                        int temp = lista[j];
                        lista[j] = lista[j + 1];
                        lista[j + 1] = temp;
                    }
                }
            }
        System.out.println("Impressão da lista crescente");
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Posição " + (i + 1) + " = " + lista[i]);
        }


        n = lista.length;
        //ordenando de forma decrescente
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista[j] < lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
        System.out.println("Impressão da lista decrescente: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Posição " + (i + 1) + " = " + lista[i]);
        }
    }
}


 

