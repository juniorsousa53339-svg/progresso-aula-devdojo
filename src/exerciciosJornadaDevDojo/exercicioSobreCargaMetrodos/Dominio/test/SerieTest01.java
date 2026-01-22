package exerciciosJornadaDevDojo.exercicioSobreCargaMetrodos.Dominio.test;

import exerciciosJornadaDevDojo.exercicioSobreCargaMetrodos.Dominio.Serie;

public class SerieTest01 {
    public static void main(String[] args) {

        Serie serie1 = new Serie("Todo mundo odeia o Cris");
        Serie serie2 = new Serie("Pica-Pau");

        System.out.println();
        System.out.println(serie1.getNome());
        System.out.println("Quantidade de episodios:");
        for (int listEp : serie1.getListEpisodios()) {

            System.out.println(listEp + "");
        }

        System.out.println();
        System.out.println(serie2.getNome());
        System.out.println("Quantidade de episodios:");
        for (int listEp : serie2.getListEpisodios()) {

            System.out.println(listEp + "");
        }
    }
}
