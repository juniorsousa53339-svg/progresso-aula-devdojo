package FmodificadorEstatico.domain.Gassosiacao.test;

import FmodificadorEstatico.domain.Gassosiacao.dominio.Time;
import FmodificadorEstatico.domain.Gassosiacao.dominio.jogador;

public class jogadorTest02 {
    public static void main(String[] args) {

        jogador j1 = new jogador("Messi");
        Time time1 = new Time("Barcelona", 23);
        j1.setTime(time1);
        j1.imprime();

        jogador j2 = new jogador("Cristiano");
        Time time2 = new Time("Real", 23);
        j2.setTime(time2);
        j2.imprime();
    }
}

