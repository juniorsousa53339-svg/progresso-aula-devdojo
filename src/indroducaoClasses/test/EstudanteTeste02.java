package indroducaoClasses.test;

import indroducaoClasses.dominio.Estudante;

public class EstudanteTeste02 {
    static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        estudante1.nome = "Luciano";
        estudante1.idade = 20;
        estudante1.sexo = 'M';

        System.out.println("\nNome: " + estudante1.nome);
        System.out.println("Idade: " + estudante1.idade);
        System.out.println("Sexo: " + estudante1.sexo);

        System.out.println("-------------");

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Dafiner";
        estudante2.idade = 20;
        estudante2.sexo = 'M';

        System.out.println("\nNome: " + estudante2.nome);
        System.out.println("Idade: " + estudante2.idade);
        System.out.println("Sexo: " + estudante2.sexo);
    }
}
