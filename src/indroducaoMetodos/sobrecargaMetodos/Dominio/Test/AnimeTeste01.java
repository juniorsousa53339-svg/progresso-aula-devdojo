package indroducaoMetodos.sobrecargaMetodos.Dominio.Test;

import indroducaoMetodos.sobrecargaMetodos.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("AAA","TV",22,"Ação");

        anime.imprime();
    }
}
