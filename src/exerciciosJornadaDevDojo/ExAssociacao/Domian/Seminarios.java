package exerciciosJornadaDevDojo.ExAssociacao.Domian;

public class Seminarios {
    private String Titulo;
    private Aluno[] alunos;
    private Local local;


    // Construtor
    public Seminarios(String titulo, Aluno[] alunos, Local local) {
       this.Titulo = titulo;
        this.alunos = alunos;
        this.local = local;

        validar(this.Titulo);
    }

    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }


    public Local getLocal() {
        return local;
    }
    public void setLocal(Local local) {
        this.local = local;
    }

    // Validation
    private void validar(String titulo) {
        if (Titulo == null || titulo.trim().equals("")) {
            throw new IllegalArgumentException("Titulo não pode ser vazio ou nulo.");

        }
    }
}
