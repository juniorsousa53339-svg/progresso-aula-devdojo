package indroducaoMetodos.test;

import indroducaoMetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Joao");
        p1.setIdade(70);
        p1.imprimir();
    }
}
