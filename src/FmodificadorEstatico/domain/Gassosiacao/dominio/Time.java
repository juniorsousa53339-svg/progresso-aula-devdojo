package FmodificadorEstatico.domain.Gassosiacao.dominio;

public class Time {
 private String nome;
 private int quantidadeJogadores;

    public String getNome() {
        return nome;
    }

    public Time(String nome, int quantidadeJogadores) {
        this.nome = nome;
        this.quantidadeJogadores = quantidadeJogadores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeJogadores() {
        return quantidadeJogadores;
    }

    public void setQuantidadeJogadores(int quantidadeJogadores) {
        this.quantidadeJogadores = quantidadeJogadores;
    }
}
