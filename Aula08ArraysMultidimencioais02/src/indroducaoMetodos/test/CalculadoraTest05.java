package indroducaoMetodos.test;

import indroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {

        Calculadora calculadora = new Calculadora();
        int[] numeros = new int[] {1,2,3,4,5,6,7,8,9,10};
          calculadora.somaArray(numeros);
          calculadora.somaVarArgs(numeros);
    }
}
