package JmodificadorFinal.Domain;

public class Carro {
    private String nome;
    public  final double VELOCIDADE_LIMITE;

    {
        VELOCIDADE_LIMITE = 300;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
