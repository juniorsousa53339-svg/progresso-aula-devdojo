package Hheranca.Test;

import Hheranca.Dominio.Endereco;
import Hheranca.Dominio.Funcionario;
import Hheranca.Dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Av Castelo Branco");
        endereco.setCep("12345");

        Pessoa pessoa = new Pessoa("Luciano");
        pessoa.setCpf("000-000-00");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Luciano Junior");
        funcionario.setCpf("101-110-10");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3500);
        funcionario.setCargo("Dev Junior");
        funcionario.imprime();

    }
}
