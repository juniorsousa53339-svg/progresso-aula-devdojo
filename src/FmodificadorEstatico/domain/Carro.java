package FmodificadorEstatico.domain;


public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velecidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println();
        System.out.println("--------------");
        System.out.println("Nome do carro: " + nome);
        System.out.println("Velocidade maxima: " + velocidadeMaxima);
        System.out.println("Velocidade limite: " + Carro.velecidadeLimite);
        System.out.println("--------------");

    }

    public static void setVelecidadeLimite(double velecidadeLimite) {

        Carro.velecidadeLimite = velecidadeLimite;
    }

    public static double getVelecidadeLimite() {
        return Carro.velecidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
