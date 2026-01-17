package sobrecargaMetodos.dominio.test.indroducaoMetodos.test;

import sobrecargaMetodos.dominio.test.indroducaoMetodos.dominio.Estudante;
import sobrecargaMetodos.dominio.test.indroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Luciano";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Dafiner";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        System.out.println("**************** ");

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
