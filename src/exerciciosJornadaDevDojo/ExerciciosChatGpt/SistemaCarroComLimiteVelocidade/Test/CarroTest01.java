package exerciciosJornadaDevDojo.ExerciciosChatGpt.SistemaCarroComLimiteVelocidade.Test;


import exerciciosJornadaDevDojo.ExerciciosChatGpt.SistemaCarroComLimiteVelocidade.Domain.Carro;

public class CarroTest01 {
   public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setNome("BMW");

        carro.acelerar(100);
        carro.acelerar(200);

        carro.frear(50);

        carro.imprimir();

    }
}
