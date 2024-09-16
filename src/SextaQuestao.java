import java.util.Scanner;

public class SextaQuestao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //lendo as horas com base na entrada do usuário
        System.out.println("Digite quantas horas deseja converter em segundos: ");
        int hora = sc.nextInt();

        //criando a variável segundos e chamando a função para converter em segundos
        int seguntos = horasEmSegundos(hora);
        //imprimindo resultado do calculo
        System.out.println(hora + " hora(s) tem " + seguntos + " segundos.");
        sc.close();
    }
    //metodo para calculo das horas em segundos
    public static int horasEmSegundos(int hora){
        int minutos = hora * 60;
        int segundos = minutos * 60;
        return segundos;
    }
}
