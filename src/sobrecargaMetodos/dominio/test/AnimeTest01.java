package sobrecargaMetodos.dominio.test;

import sobrecargaMetodos.dominio.test.indroducaoMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("aaa","tv",22,"AÇÃO");
        anime.imprimir();
    }
}
