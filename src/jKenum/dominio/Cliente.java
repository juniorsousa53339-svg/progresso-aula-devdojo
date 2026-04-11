package jKenum.dominio;

public class Cliente {
    private String nome;
    private tipoCliente tipoCliente;



    public Cliente(String nome, tipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public tipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(tipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }
}
