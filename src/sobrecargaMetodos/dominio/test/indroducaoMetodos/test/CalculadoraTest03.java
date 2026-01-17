package sobrecargaMetodos.dominio.test.indroducaoMetodos.test;

import sobrecargaMetodos.dominio.test.indroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main(String[] args) {
        Calculadora Calculadora = new Calculadora();
         double result = Calculadora. DivisaoDeDoisNum(20,0);
         System.out.println(result);
        System.out.println(Calculadora. DivisaoDeDoisNum(20,0));
        System.out.println("--------------");
      Calculadora.imprimeDivisaoDeDoisNum(86,5);
    }
}
