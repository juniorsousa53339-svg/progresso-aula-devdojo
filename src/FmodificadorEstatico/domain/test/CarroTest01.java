package FmodificadorEstatico.domain.test;

import FmodificadorEstatico.domain.Carro;

public class CarroTest01 {
    static void main(String[] args) {

        Carro c1 = new Carro("BMW",200);
        Carro c2 = new Carro("Ferrai",230);
        Carro c3 = new Carro("Auge",190);

        Carro.setVelecidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
