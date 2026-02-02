package FmodificadorEstatico.domain.Gassosiacao.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("\nO grande software de previsão do futuro\n");
        System.out.println("Digite sua pergunta e eu responderei sim ou não");

        String pergunta = input.nextLine();

        if (pergunta.charAt(0) == ' ') {
            System.out.println("\nSIM");

        } else {
            System.out.println("\nNAO");
        }

    }
}
