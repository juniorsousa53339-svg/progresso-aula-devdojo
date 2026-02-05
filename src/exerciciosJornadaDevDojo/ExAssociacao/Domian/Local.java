package exerciciosJornadaDevDojo.ExAssociacao.Domian;

public class Local {
    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;

        ValidarEnd(this.endereco);
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    private void ValidarEnd(String endereco) {

        if (endereco == null || "".equals(endereco)) {
            throw new IllegalArgumentException("O endereço deve ser preenchida");
        }
    }
}
