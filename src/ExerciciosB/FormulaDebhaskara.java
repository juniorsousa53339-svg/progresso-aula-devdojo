package ExerciciosB;

import java.util.Locale;
import java.util.Scanner;

public class FormulaDebhaskara {
    static void main(String[] args) {


        double intervalo1 = 25.000;
        double intervalo2 = 50.0000000;
        double intervalo3 = 75.0000000;
        double intervalo4 = 100.0000000;



        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double valor = sc.nextDouble();

        if (valor <= intervalo1 && valor >= 0) {
            System.out.println("Intervalo " + "[0,25]" );

        }  else if (valor <= intervalo2 && valor > 0) {
            System.out.println("Intervalo" + " (25,50]");

        } else if (valor <= intervalo3 && valor > 0) {
            System.out.println("Intervalo" + "[50,75)");

        } else if (valor <= intervalo4 && valor > 0) {
            System.out.println("Intervalo" + " (75,100]");

        }else  {
            System.out.println("Fora de intervalo");



        }
    }
}
