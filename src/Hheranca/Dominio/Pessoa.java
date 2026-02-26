package Hheranca.Dominio;

public class Pessoa  {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco estatico de Pessoa");
    }

    {

        System.out.println("Dentro do bloco de Inicialização de Pessoa - 1");

    }

    {

        System.out.println("Dentro do bloco de Inicialização de Pessoa - 2");

    }


    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de Pessoa");
        super();
        this.nome = nome;
    }

    public void imprime() {
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Rua: " + this.endereco.getRua());
        System.out.println("CEP: " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

