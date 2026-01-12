

public class Aula07Arrays02E3 {
     public static void main(String[] args) {


//         // Criando Array de 3 posições
//         String[] nomes = new String[3];
//         nomes[0] = "Jesus";
//         nomes[1] = "lUCIANO";
//         nomes[2] = "Dafiner";
//
//         for(String Imprimir : nomes) { // Imprimindo os nomes que estão no Array
//             System.out.println("\n" +Imprimir);
//             System.out.println("-------------");
//         }

         int[] idades = new int[3];

         idades[0] = 10;
         idades[1] = 20;
         idades[2] = 30;


        int contador = 1;
         for(int Imprimir : idades) {
             System.out.println("Aluno;" +contador+" \n Tem; " + Imprimir + " Anos de idade");
             contador++;
             System.out.println("-------------");
         }
     }

}
