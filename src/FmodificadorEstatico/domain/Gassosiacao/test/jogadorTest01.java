package FmodificadorEstatico.domain.Gassosiacao.test;

import FmodificadorEstatico.domain.Gassosiacao.dominio.jogador;

public class jogadorTest01 {
    public static void main(String[] args) {

        jogador jogador1 = new jogador("NEG0LU");
        jogador jogador2 = new jogador("MESSI");
        jogador jogador3 = new jogador("RONALDINHO");

        jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (jogador jogador : jogadores) {
            System.out.println();
            System.out.println(jogador);
            jogador.imprime();
        }
    }
}
