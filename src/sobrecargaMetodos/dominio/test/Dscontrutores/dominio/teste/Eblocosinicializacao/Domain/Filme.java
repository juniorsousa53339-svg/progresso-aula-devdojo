package sobrecargaMetodos.dominio.test.Dscontrutores.dominio.teste.Eblocosinicializacao.Domain;

public class Filme {

    private String nome;
    private int[] episodios;

    {
        System.out.println("Dentro do bloco de inicializacao");

        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Filme(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public Filme() {

        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

        System.out.println();
        System.out.println("Numero de episodios");
        System.out.println();
        for (int episodio : this.episodios) {
            System.out.println(episodio + "");
        }
        System.out.println();
    }
}
