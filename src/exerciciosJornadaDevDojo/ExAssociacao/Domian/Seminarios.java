package exerciciosJornadaDevDojo.ExAssociacao.Domian;

public class Seminarios {
    private String Titulo;
    private  String [] TituloSem = {"A evolução da Programaçãp", "Como surgio A internet", "Como a IA está mudando o mundo"};

    // Construtor
    public Seminarios(String titulo) {
        Titulo = titulo;

        validar(this.Titulo);
    }

    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    // Validation
    private void validar(String titulo) {
        if (Titulo == null || titulo.trim().equals("")) {
            throw new IllegalArgumentException("Titulo não pode ser vazio ou nulo.");

        }
    }
}
