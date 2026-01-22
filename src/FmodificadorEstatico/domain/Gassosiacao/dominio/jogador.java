package FmodificadorEstatico.domain.Gassosiacao.dominio;

public class jogador {

    private String nome;

    public jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
    }

}
