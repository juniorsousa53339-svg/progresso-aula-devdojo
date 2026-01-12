package indroducaoMetodos.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;

    public void imprimeDados() {
        System.out.println();
        System.out.println("==========================================");
        System.out.println("   RELATÓRIO DO Funcionario: " + this.nome);
        System.out.println("==========================================");
        System.out.println("Nome  : " + this.nome);
        System.out.println("Idade : " + this.idade + " anos");

        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
            System.out.println();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

    public void mediaSalarioImprimir() {
        if (salarios == null) {

            return;
        }


        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("Media Salarial: " + media);
    }

}

