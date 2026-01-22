package exerciciosJornadaDevDojo.exercicioSobreCargaMetrodos.Dominio;


public class Serie {

    private String nome;
    private int[] listEpisodios;

    // Bloco de Inicialização
    {
        listEpisodios = new int[3];
        for (int i = 0; i < listEpisodios.length; i++) {
            listEpisodios[i] = i + 1;
        }
    }

    public Serie() {

        for (int listEpisodio : this.listEpisodios) {
            System.out.println(listEpisodio + "");
        }
    }

    public Serie(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public int[] getListEpisodios() {
        return listEpisodios;
    }
}




