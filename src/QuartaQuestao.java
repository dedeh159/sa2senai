import java.util.Scanner;

public class QuartaQuestao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos underscore deseja imprimir? ");
        int linha = sc.nextInt();

        linha(linha);


        sc.close();
    }
    public static void linha(int linha){
            for(int i = 0; i <= linha;i++){
            System.out.print("_");
        }
    }
}
