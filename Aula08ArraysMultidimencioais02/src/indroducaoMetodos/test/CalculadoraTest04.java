package indroducaoMetodos.test;

import indroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {


     Calculadora calculadora = new Calculadora();
     int num1 = 1;
     int num2 = 2;

     Calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("\n Dentro do CalculadoraTest04");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

    }
}
