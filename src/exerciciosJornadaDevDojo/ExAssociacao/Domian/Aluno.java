package exerciciosJornadaDevDojo.ExAssociacao.Domian;

public class Aluno {
    private String nome;
    int idade;
    private Seminarios seminarios;

    //Construtor
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;


        //  CHAMANDO VALIDATIONS
        ValidarIdade(this.idade);
        ValidarNome(this.nome);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminarios getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios seminarios) {
        this.seminarios = seminarios;
    }

    //  Validations
    private void ValidarNome(String nome) {

        if (nome == null || nome.trim().equals("")) {
            throw new IllegalArgumentException("Nome não poder ser nulo ou vazio.");
        }
    }

    private void ValidarIdade(int idade) {

        if (idade < 6) {
            throw new IllegalArgumentException("Idade tem que ser maior que 6 anos. ");
        }
        if (idade > 18) {
            throw new IllegalArgumentException("Idade tem que ser menor que 18 anos.");
        }
    }
}
