package FmodificadorEstatico.domain.Gassosiacao.dominio;

import java.util.ArrayList;

public class Professor {
    private String nome;

    // Construtor
    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Professor[] professores;

}
