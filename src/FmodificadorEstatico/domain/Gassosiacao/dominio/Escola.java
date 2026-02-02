package FmodificadorEstatico.domain.Gassosiacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    // Metodo Construtor
    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    // Metodo Imprime
    public void Imprime() {

        System.out.println();
        System.out.println("Escola: " + this.nome);
        if (professores == null) return;
        for (Professor professor : professores) {
            System.out.println("Professor: " + professor.getNome());
        }

    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessors(Professor[] professores) {
        this.professores = this.professores;
    }
}
