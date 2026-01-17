package exerciciosJornadaDevDojo.AulasArray;

public class Aula08ArrayMutidimencionais02 {
    static void main(String[] args) {

        int[] dias = {1, 2, 3};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[] {1, 2, 3};
        arrayInt[2] = new int[6];

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3} ,{1, 2, 3, 4, 5, 6}};

     for (int[] imprimir: arrayInt2) {
         System.out.println("\n----");

         for (int num : imprimir) {
             System.out.print(num + " ");
         }
     }
    }
}