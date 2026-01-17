package sobrecargaMetodos.dominio.test.Dscontrutores.dominio.teste;

import sobrecargaMetodos.dominio.test.Dscontrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime("Apenas um Show", "TV", 22, "Aventura","Estudios Brazil");
        Anime anime2 = new Anime("Hora de Aventura", "TV", 19, "Aventura");

        anime.imprimir();
        anime2.imprimir();
    }
}
