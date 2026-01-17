package sobrecargaMetodos.dominio.test.indroducaoMetodos.test;

import sobrecargaMetodos.dominio.test.indroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    static void main(String[] args) {

        CalculadoraTest01 calculadoraTest01 = new CalculadoraTest01();
        Calculadora.somaDoisNumeros();
        System.out.println("-------");
        Calculadora.subtrairDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
    }
}
