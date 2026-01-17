package sobrecargaMetodos.dominio.test.indroducaoMetodos.dominio;

public class Calculadora {

    public static void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public static void subtrairDoisNumeros(){
        System.out.println(70 - 3);
    }

    public static void multiplicaDoisNumeros(int num, int num2){
        System.out.println(num * num2);
    }

    public double DivisaoDeDoisNum(double num1, double num2){
        if(num2 != 0){
            return num1 / num2;
        }
        System.out.println();
        System.out.println("Não existe divisão por zero");
        return 0;
    }

    public void imprimeDivisaoDeDoisNum(double num1, double num2){

        if(num2 == 0){
            System.out.println();
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1/num2);
    }
    public static void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;

        System.out.println("\n Dentro do alteraDoisNumeros");
        System.out.println("numero1: " + numero1);
        System.out.println("numero2: " + numero2);

    }

     public void somaArray( int[] numeros){
        int soma = 0;

        for(int num : numeros){
            soma += num;
        }
         System.out.println();
         System.out.println("---------------------------------");
        System.out.println("Soma Utilizando Array: " + soma);
         System.out.println("---------------------------------");
         System.out.println();
     }

     public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
         System.out.println();
         System.out.println("---------------------------------");
         System.out.println("Soma Utilizando VarArgs: " + soma);
         System.out.println("---------------------------------");
         System.out.println();
     }
}
