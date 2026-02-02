package FmodificadorEstatico.domain.Gassosiacao.test;

import FmodificadorEstatico.domain.Gassosiacao.dominio.Escola;
import FmodificadorEstatico.domain.Gassosiacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Xuxa");
        Professor[] professores = {professor1};
        Escola escola1 = new Escola("E.E. Jose Vieira De Morais", professores);

        escola1.Imprime();
    }
}
