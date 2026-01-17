package sobrecargaMetodos.dominio.test;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("aaa","tv",22,"AÇÃO");
        anime.imprimir();
    }
}
