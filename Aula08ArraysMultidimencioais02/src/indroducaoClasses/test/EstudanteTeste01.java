package indroducaoClasses.test;

import indroducaoClasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        estudante1.nome = "Pedro";
        estudante1.idade = 20;
        estudante1.sexo = 'M';

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Maria";
        estudante2.idade = 21;
        estudante2.sexo = 'F';
    }
}
