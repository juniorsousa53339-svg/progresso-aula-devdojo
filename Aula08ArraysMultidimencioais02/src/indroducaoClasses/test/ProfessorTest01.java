package indroducaoClasses.test;

import indroducaoClasses.dominio.Estudante;
import indroducaoClasses.dominio.Professor;

public class ProfessorTest01 {
    static void main(String[] args) {


        Professor Professor1 = new Professor();
        Professor1.nome = "Fernando";
        Professor1.idade = 40;
        Professor1.sexo = 'M';

        System.out.println(

                "\nNome: " +Professor1.nome + "\n"+
                "Idade: " +Professor1.idade + "\n" +
                "Sexo: " +Professor1.sexo + "\n"
        );

    }
}
