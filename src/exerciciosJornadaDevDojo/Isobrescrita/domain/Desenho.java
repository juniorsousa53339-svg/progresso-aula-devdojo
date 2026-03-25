package exerciciosJornadaDevDojo.Isobrescrita.domain;

import FmodificadorEstatico.domain.AnimeModificador;

public class Desenho extends Object {
    private String nome;


    @Override
    public String toString() {
        return "Desenho{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Desenho(String nome) {
       this.nome = nome;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
