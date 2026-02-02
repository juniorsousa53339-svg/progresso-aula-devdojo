package exerciciosJornadaDevDojo.ExerciciosChatGpt;

import java.util.Scanner;

public class exercicioArraymutiGpt {
    public static void main(String[] args) {

        int[][] notas = new int[3][3];
        System.out.println("\n===Matriz de Notas de Alunos===");

        Scanner input = new Scanner(System.in);

        // Loop para prova 1 (coluna 0)
        System.out.println("\n===PROVA 1===");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota da prova 1 do aluno-%d: ", (i + 1));
            notas[i][0] = input.nextInt();
            while (notas[i][0] < 1 || notas[i][0] > 10) {
                System.out.println("Nota inválida. Digite um valor inteiro entre 1 e 10:");
                notas[i][0] = input.nextInt();
            }
        }

        // Loop para prova 2 (coluna 1)
        System.out.println("\n===PROVA 2===");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota da prova 2 do aluno-%d: ", (i + 1));
            notas[i][1] = input.nextInt();
            while (notas[i][1] < 1 || notas[i][1] > 10) {
                System.out.println("Nota inválida. Digite um valor inteiro entre 1 e 10:");
                notas[i][1] = input.nextInt();
            }
        }

        // Loop para prova 3 (coluna 2)
        System.out.println("\n===PROVA 3===");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota da prova 3 do aluno-%d: ", (i + 1));
            notas[i][2] = input.nextInt();
            while (notas[i][2] < 1 || notas[i][2] > 10) {
                System.out.println("Nota inválida. Digite um valor inteiro entre 1 e 10:");
                notas[i][2] = input.nextInt();
            }
        }

        // Mostrar resultado por aluno e média de cada aluno
        System.out.println("\n===RESULTADO DOS ALUNOS===");
        for (int i = 0; i < notas.length; i++) {
            int soma = 0;
            System.out.print("Aluno " + (i + 1) + " - Notas: ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + (j < notas[i].length - 1 ? " | " : ""));
                soma += notas[i][j];
            }
            double media = (double) soma / notas[i].length;
            System.out.printf("  -> Média: %.2f%n", media);
        }

        input.close();
    }
}
