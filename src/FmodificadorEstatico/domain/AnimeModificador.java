package FmodificadorEstatico.domain;

public class AnimeModificador {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println();
        System.out.println("Dentro do bloco");

        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public AnimeModificador(String nome) {
        this.nome = nome;
    }

    public AnimeModificador() {
        for (int episodio : AnimeModificador.episodios) {
            System.out.print(episodio + " ");
        }
    }
}
