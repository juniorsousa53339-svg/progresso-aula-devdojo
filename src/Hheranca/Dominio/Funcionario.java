package Hheranca.Dominio;

public class Funcionario extends Pessoa{
    private double salario;
    private String Cargo;


    public Funcionario(String nome) {
        super(nome);

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
