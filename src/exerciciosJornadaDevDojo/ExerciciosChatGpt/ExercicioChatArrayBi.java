package exerciciosJornadaDevDojo.ExerciciosChatGpt;

import java.util.Scanner;

public class ExercicioChatArrayBi {
    public static void main(String[] args) {

       double[][] notaAlunos = new double[3][4]; // 3 alunos && 4 notas

          Scanner input = new Scanner(System.in);


          double somaNotasAlunos1 = 0;
          double somaNotasAlunos2 = 0;
          double somaNotasAlunos3 = 0;


        System.out.println("\n>>>PROVA 1<<<\n");
           for (int i = 0; i < notaAlunos.length; i++) {
               System.out.printf("Digite a nota da prova 1 do aluno %d: ", (i + 1));
               notaAlunos[i][0] = input.nextDouble();

               //Validação
               while (notaAlunos[i][0] < 0.0 || notaAlunos[i][0] > 10.0) {
               System.out.println("\nNota invalida. Digite novamente: ");
               notaAlunos[i][0] = input.nextDouble();

               }
               somaNotasAlunos1 += notaAlunos[i][0];
           }
        System.out.println("\n>>>PROVA 2<<<\n");
              for (int i = 0; i < notaAlunos.length; i++) {
            System.out.printf("Digite a nota da prova 2 do aluno %d: ", (i + 1));
            notaAlunos[i][0] = input.nextDouble();

            //Validação
            while (notaAlunos[i][0] < 0.0 || notaAlunos[i][0] > 10.0) {
                System.out.println("\nNota invalida. Digite novamente: ");
                notaAlunos[i][0] = input.nextDouble();

            }
                  somaNotasAlunos1 += notaAlunos[i][0];

           }
               System.out.println("\n>>>PROVA 3<<<\n");
        for (int i = 0; i < notaAlunos.length; i++) {
            System.out.printf("Digite a nota da prova 3 do aluno %d: ", (i + 1));
            notaAlunos[i][0] = input.nextDouble();

            //Validação
            while (notaAlunos[i][0] < 0.0 || notaAlunos[i][0] > 10.0) {
                System.out.println("\nNota invalida. Digite novamente: ");
                notaAlunos[i][0] = input.nextDouble();

            }
            somaNotasAlunos1 += notaAlunos[i][0];

        }

             System.out.println("\n>>>PROVA 4<<<\n");
        for (int i = 0; i < notaAlunos.length; i++) {
            System.out.printf("Digite a nota da prova 4 do aluno %d: ", (i + 1));
            notaAlunos[i][0] = input.nextDouble();

            //Validação
            while (notaAlunos[i][0] < 0.0 || notaAlunos[i][0] > 10.0) {
                System.out.println("\nNota invalida. Digite novamente: ");
                notaAlunos[i][0] = input.nextDouble();

            }
            somaNotasAlunos1 += notaAlunos[i][0];

        }
    }
}


