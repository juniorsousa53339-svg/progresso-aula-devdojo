package indroducaoMetodos.test;

import indroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();

        funcionario1.nome = "Luciano";
        funcionario1.idade = 20;
        funcionario1.salario1 = 1500;
        funcionario1.salario2 = 1000;
        funcionario1.salario3 = 700;

        funcionario1.imprimeDados();
        funcionario1.mediaSalarioImprimir();
    }
}
