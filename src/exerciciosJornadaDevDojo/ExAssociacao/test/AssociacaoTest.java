package exerciciosJornadaDevDojo.ExAssociacao.test;

import exerciciosJornadaDevDojo.ExAssociacao.Domian.Aluno;
import exerciciosJornadaDevDojo.ExAssociacao.Domian.Local;
import exerciciosJornadaDevDojo.ExAssociacao.Domian.Professores;
import exerciciosJornadaDevDojo.ExAssociacao.Domian.Seminarios;

public class AssociacaoTest {
    static void main(String[] args) {

        Local local = new Local("RUA MIQUEL TAVARES");
        Aluno aluno = new Aluno("Luciano", 18);
        Professores professores = new Professores("Jubileu", "Portugues");

        Aluno[] alunos = {aluno};
        Seminarios seminarios = new Seminarios("Java para aniciantes", alunos, local);

        Seminarios[] seminariosDisponiveis = {seminarios};
        professores.setSeminarios(seminariosDisponiveis);
    }
}
