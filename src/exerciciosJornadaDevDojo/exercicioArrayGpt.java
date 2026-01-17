package exerciciosJornadaDevDojo;

public class exercicioArrayGpt {
    static void main(String[] args) {

        // Array bidimensional (3 meses)
        int[][] dias = new int[3][];

        // Inicialização dos meses
           dias[0] = new int[31];
           dias[1] = new int[28];
           dias[2] = new int[30];

        // Preenchendo os dias de cada mês
          for ( int i = 0; i < dias.length; i++ ) {
              for ( int j = 0; j < dias[i].length; j++ ) {
                  dias[i][j] = j + 1;
              }
          }
        // Exibindo os meses e seus dias
          for ( int i = 0; i < dias.length; i++ ) {
              System.out.println("\nMês " + (i + 1));
              System.out.println("Total de dias: " + dias[i].length);

              for ( int j = 0; j < dias[i].length; j++ ) {
                  System.out.print(dias[i][j] + " ");
              }
              System.out.println();
          }
    }
    }
