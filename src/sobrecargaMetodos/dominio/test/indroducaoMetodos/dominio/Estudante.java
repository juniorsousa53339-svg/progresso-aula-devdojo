
package sobrecargaMetodos.dominio.test.indroducaoMetodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){

        System.out.println();
        System.out.println("==============================");
        System.out.println("    RELATÓRIO DO ESTUDANTE");
        System.out.println("==============================");
        System.out.println("Nome  : " + this.nome);
        System.out.println("Idade : " + this.idade + " anos");
        System.out.println("Sexo  : " + this.sexo);
        System.out.println();
        System.out.println("Status: Em desenvolvimento acadêmico 🚀");
        System.out.println("==============================");
        System.out.println();
    }
}

