package indroducaoMetodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario1;
    public double salario2;
    public double salario3;


    public void imprimeDados(){
        System.out.println();
        System.out.println("==============================");
        System.out.println("    RELATÓRIO DO Funcionario: " +this.nome);
        System.out.println("==============================");
        System.out.println("Nome  : " + this.nome);
        System.out.println("Idade : " + this.idade + " anos");
        System.out.println("Salario Mes 01  : " + this.salario1);
        System.out.println("Salario Mes 02  : " + this.salario2);
        System.out.println("Salario Mes 03  : " + this.salario3);
        System.out.println("==============================");
        System.out.println();
    }

    public void mediaSalarioImprimir() {
        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("media = " + media);
        return;
    }
}
