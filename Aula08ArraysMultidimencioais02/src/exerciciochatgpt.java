import java.util.Scanner;

public class exerciciochatgpt {
    public static void main(String[] args) {

    System.out.println("\nQuantos alunos existem na sala?");
    Scanner input = new Scanner(System.in);
    int qtdalunos = input.nextInt();
        int soma = 0;

        int[] notas = new int[qtdalunos];

        for(int i = 0; i < notas.length; i++){
            System.out.print("\nDigite a nota do aluno " + (i + 1) + ": ");
            int nota = input.nextInt();

            while (nota < 0 || nota > 10){ // Validação
                System.out.println("Digite uma nota inteira de 1/10: ");

                nota = input.nextInt();
            }
            notas[i] = nota;
            soma += nota;
        }
        int maior = notas[0];
        int menor = notas[0];

        for(int i = 0; i < notas.length; i++){

            if(notas[i] > maior){
                maior = notas[i];
            }
            if(notas[i] < menor){
                menor = notas[i];
            }
        }
        System.out.println("\n>>>Média da turma<<<");
        double media = (double) soma / notas.length;
        System.out.println("Resultado: " + media);

        int acima = 0;
        int abaixo = 0;

        for(int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                acima++;
            }
           if(notas[i] < media){
          abaixo++;
          }

        }
        System.out.println("\n>>> MAIOR NOTA <<<");
        System.out.println(maior);

        System.out.println("\n>>> MENOR NOTA <<<");
        System.out.println(menor);

        System.out.println("\n>>> ACIMA DA MEDIA <<<");
        System.out.println(acima);

        System.out.println("\n>>> ABAIXO DA MEDIA <<<\n"
        +abaixo);

        input.close();
    }
}