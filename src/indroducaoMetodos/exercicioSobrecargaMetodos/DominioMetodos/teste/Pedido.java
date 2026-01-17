package indroducaoMetodos.exercicioSobrecargaMetodos.DominioMetodos.teste;

public class Pedido {

    public Pedido(){

    }

    private String nomeCliente;
    private String produto;
    private int quantidade;
    private double precoUnitario;


    public void init(String nomeCliente, String produto) {
        this.nomeCliente = nomeCliente;
        this.produto = produto;
    }

    public void init(String nomeCliente, String produto, int quantidade, double precoUnitario) {

        this.init(nomeCliente, produto);

        this.nomeCliente = nomeCliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nomeCliente);
        System.out.println("Produto: " + this.produto);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Preço unitario: " + this.precoUnitario);
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }


}
