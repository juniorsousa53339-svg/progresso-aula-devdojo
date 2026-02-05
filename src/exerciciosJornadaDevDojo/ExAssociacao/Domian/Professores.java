package exerciciosJornadaDevDojo.ExAssociacao.Domian;

public class Professores {
    private String nome;
    private String especialidade;
    private Seminarios[] seminarios;


    // CONSTRUTOR
    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;

        // Chamando validações
        ValidarNome(this.nome);
        ValidarEsp(this.especialidade);
    }

    public Seminarios[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    // validações
    private void ValidarNome(String nome) {

        if (nome == null || nome.trim().equals("")) {
            throw new IllegalArgumentException("Nome não poder ser nulo ou vazio.");
        }
    }

    private void ValidarEsp(String especialidade) {

        if (especialidade == null || especialidade.equals("")) {
            throw new IllegalArgumentException("Especialidade não poder ser nulo ou vazio.");
        }
    }
}
