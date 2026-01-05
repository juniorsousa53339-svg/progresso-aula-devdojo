package indroducaoMetodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {

        System.out.println();
        System.out.println("_______________");
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        estudante.nome = "NEGOLU";
        System.out.println("_______________");
    }
}
