package exerciciosJornadaDevDojo;

import java.util.Scanner;

public class NovoExercicioArray {
   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Criacão do Array
        System.out.println("\nQuantos números desejá digitar?");
        int qtd = input.nextInt();

        int[] num = new int[qtd];

        // Saber quantos números são positivos e negativos
        int positivo = 0;
        int negativo = 0;
        int zero = 0;

        // Preenchendo o Array
        for (int i = 0; i < qtd; i++) {
            System.out.print("\nDigite O valor " + (i + 1) + ": ");
            num[i] = input.nextInt();

            if (num[i] < 0) {
                negativo++;
            } else if (num[i] == 0) {
                zero++;
            } else {
                positivo++;
            }
        }
            // Resultado para o user visualizar
            System.out.println("\n>>> NÙMEROS POSITIVOS <<<");
            System.out.println(positivo);
        System.out.println("------------------------------");

            System.out.println("\n>>> NÙMEROS NEGATIVOS <<<");
            System.out.println(negativo);
        System.out.println("------------------------------");

            System.out.println("\n>>> NÙMEROS == 0 <<<");
            System.out.println(zero);
        System.out.println("------------------------------");

            System.out.println("\nObigado por acessar, finalizando sistema...");

        input.close();
    }
}
