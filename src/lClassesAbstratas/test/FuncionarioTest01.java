package lClassesAbstratas.test;

import lClassesAbstratas.dominio.Desenvolvedor;
import lClassesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Gerente g1 = new Gerente("Messi",200000000);
        System.out.println(g1);

        Desenvolvedor d1 = new Desenvolvedor("junior",1000);
        System.out.println(d1);
    }
}
