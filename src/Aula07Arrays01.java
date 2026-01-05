import java.util.Scanner;

public class Aula07Arrays01{
    public static void main(String[] args) {

      int[] notas = new int[5];

      Scanner input = new Scanner(System.in);

      int soma = 0;


      for(int i = 0; i < notas.length; i++){
          System.out.print("\nDigite a nota " + (i + 1) + ": ");
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
        System.out.println("\n>>>NOTAS DIGITADAS<<<");
      for (int nota : notas){
          System.out.println("------------------");
          System.out.println(nota);
          System.out.println("------------------");
      }
        System.out.println("\n>>>SOMA DAS NOTAS<<<");
      System.out.println("Resultado: " + soma);

        System.out.println("\n>>>Média<<<");
        double media = (double) soma / notas.length;
        System.out.println("Resultado: " + media);

        System.out.println("\n>>> MAIOR NOTA <<<");
        System.out.println(maior);

        System.out.println("\n>>> MENOR NOTA <<<");
        System.out.println(menor);

        input.close();

    }
}
