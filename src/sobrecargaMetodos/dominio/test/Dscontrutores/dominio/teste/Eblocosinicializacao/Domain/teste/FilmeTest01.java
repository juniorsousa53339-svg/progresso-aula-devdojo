package sobrecargaMetodos.dominio.test.Dscontrutores.dominio.teste.Eblocosinicializacao.Domain.teste;

import sobrecargaMetodos.dominio.test.Dscontrutores.dominio.teste.Eblocosinicializacao.Domain.Filme;
import sobrecargaMetodos.dominio.test.Dscontrutores.dominio.teste.Eblocosinicializacao.Domain.Filme;

public class FilmeTest01 {
    public static void main(String[] args) {

        Filme filme1 = new Filme("Apenas um show");
        Filme filme2 = new Filme("Hora de Aventura");

        System.out.println(filme1.getEpisodios());
        System.out.println(filme2.getEpisodios());

        for (int episodio : filme1.getEpisodios()) {

            System.out.print(episodio + " ");
        }



        for (int episodio : filme1.getEpisodios()) {

            System.out.print(episodio + " ");
        }
    }
}
