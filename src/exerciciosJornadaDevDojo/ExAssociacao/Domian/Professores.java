package exerciciosJornadaDevDojo.ExAssociacao.Domian;

public class Professores {
    private String nome;
    private String especialidade;

    private enum Especialidade {
        PORTUGUES,
        MATEMATICA,
        GEOGRAFIA,
        HISTORIA,
        CIENCIA,
        ED_FISICA,
        ARTES
    }

    // CONSTRUTOR
    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;

       // Chamando validações
        ValidarNome(this.nome);
        ValidarEsp( Especialidade.valueOf(especialidade));
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
    private String ValidarEsp(Enum especialidade) {

        if (especialidade == null || especialidade.equals("")) {
            throw new IllegalArgumentException("Especialidade não poder ser nulo ou vazio.");
        }

        for (Especialidade e : Especialidade.values()) {
            if (e.name().equalsIgnoreCase(String.valueOf(especialidade))) {
                return e.name();
            }
        }
        throw new IllegalArgumentException("Especialidade não existe nessa escola");
    }
}
