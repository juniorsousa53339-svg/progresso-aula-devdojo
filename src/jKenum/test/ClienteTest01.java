package jKenum.test;

import jKenum.dominio.Cliente;
import jKenum.dominio.tipoCliente;

public class ClienteTest01 {
    static void main(String[] args) {
        Cliente c1 = new Cliente("Luciano", tipoCliente.PESSOA_FISICA);
        Cliente c2 = new Cliente("Dafiner", tipoCliente.PESSOA_JURIDICA);
        Cliente c3 = new Cliente("Jade",tipoCliente.PESSOA_JURIDICA);


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
