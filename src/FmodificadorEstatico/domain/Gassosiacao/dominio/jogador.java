package FmodificadorEstatico.domain.Gassosiacao.dominio;

public class jogador {

    private String nome;
    private Time time;


    public jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void imprime() {
        System.out.println();
        System.out.println("_______________________________");
        System.out.println( "Nome do atleta: " + this.nome);

        if (time != null) {
            System.out.println("Time atual: " + time.getNome());
            System.out.println("_______________________________");
        }

    }

}
