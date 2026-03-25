package exerciciosJornadaDevDojo.ExerciciosChatGpt.SistemaCarroComLimiteVelocidade.Domain;

public class Carro {

    private String nome;
    private double velocidadeAtual;
    private static final double VELOCIDADE_LIMITE = 250;

   public Carro() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
       ValidarNome(nome);
        this.nome = nome;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
       ValidarVelocidadeAtual(velocidadeAtual);
        this.velocidadeAtual = velocidadeAtual;
    }


    //    Validacoes
    public void ValidarNome(String nome) {
        if (nome.isBlank() || nome.length() < 3) {
            throw new RuntimeException("Nome invalido");
        }
    }

    public void ValidarVelocidadeAtual(double velocidadeAtual) {

        if (velocidadeAtual > VELOCIDADE_LIMITE) {
            throw new RuntimeException("Voce passou o Limite de velocidade!!");
        }
        if (velocidadeAtual < 0) {
            throw new RuntimeException("Sua Velocidade tem que ser maior que zero!");
        }
    }

   //    METODOS
    public void acelerar(double valor) {

       double novaVelocidadeAtual = this.velocidadeAtual + valor;
        if (novaVelocidadeAtual > VELOCIDADE_LIMITE) {
            this.velocidadeAtual = VELOCIDADE_LIMITE;
            return;
        }
        this.velocidadeAtual = novaVelocidadeAtual;
    }

    public void frear(double valor) {

       double novaVelocidadeAtual = this.velocidadeAtual - valor;

        if (novaVelocidadeAtual < 0) {
            this.velocidadeAtual = 0;
            return;
        }

        this.velocidadeAtual = novaVelocidadeAtual;
    }

    public void imprimir() {
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("Carro: " + nome);
        System.out.println("Velocidade Atual: " + velocidadeAtual);
        System.out.println("Velocidade Limite: " + VELOCIDADE_LIMITE);
        System.out.println("----------------------------------------");

    }
}
