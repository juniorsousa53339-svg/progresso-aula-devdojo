package sobrecargaMetodos.dominio.test.indroducaoMetodos.test;

import sobrecargaMetodos.dominio.test.indroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("Luciano");
        funcionario1.setIdade(20);
        funcionario1.setSalarios(new double[]{2000, 4300, 6400,});

        funcionario1.imprimeDados();
      funcionario1.mediaSalarioImprimir();

        System.out.println("media: " + funcionario1.getMedia());
    }
}
