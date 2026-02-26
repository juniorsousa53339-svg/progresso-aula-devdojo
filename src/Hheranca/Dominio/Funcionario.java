package Hheranca.Dominio;

public class Funcionario extends Pessoa{
    private double salario;
    private String Cargo;


    static {
        System.out.println("Dentro do bloco estatico de Funcionario");
    }

    {

        System.out.println("Dentro do bloco de Inicialização de Funcinario - 1");

    }

    {

        System.out.println("Dentro do bloco de Inicialização de Funcionario - 2");

    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");

    }

    public void imprime(){
        super.imprime();
        System.out.println("Salario: "+ salario);
        System.out.println("Cargo: "+ Cargo);
        System.out.println("---------------------------------");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }
}
