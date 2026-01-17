package sobrecargaMetodos.dominio.test.indroducaoMetodos.test;

import sobrecargaMetodos.dominio.test.indroducaoMetodos.dominio.Estudante;

public class EstudanteTest02 {

    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Luciano";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante02.nome = "Dafiner";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

       estudante01.imprime();
       estudante02.imprime();


    }
}
