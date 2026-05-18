package ExerciciosB;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lanche {

    private int codigo;
    private String descricao;
    private double valor;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Lanche(int codigo, String descricao, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }
    static void main(String[] args) {


        List<Lanche> lista = new ArrayList<>();

        Lanche l1 = new Lanche(1, "Cachorro Quente", 4.00);
        lista.add(l1);

        Lanche l2 = new Lanche(2, "X-Salada", 4.50);
        lista.add(l2);

        Lanche l3 = new Lanche(3, "X-Bacon", 5.00);
        lista.add(l3);

        Lanche l4 = new Lanche(4, "Torrada Simples", 2.00);
        lista.add(l4);

        Lanche l5 = new Lanche(5, "Refrigerante", 1.50);
        lista.add(l5);

        Scanner input = new Scanner(System.in);

        int opcao = input.nextInt();
        int quantidade = input.nextInt();
        double total = 0;

        if (opcao == 1) {
            total = l1.valor * quantidade;
            System.out.printf("Total: R$ %.2f%n ", total);

        } else if (opcao == 2) {
            total = l2.valor * quantidade;
            System.out.printf("Total: R$ %.2f%n ", total);

        } else if (opcao == 3) {
            total = l3.valor * quantidade;
            System.out.printf("Total: R$ %.2f%n ", total);

        }else if (opcao == 4) {
            total = l4.valor * quantidade;
            System.out.printf("Total: R$ %.2f%n ", total);

        } else if (opcao == 5) {
            total = l5.valor * quantidade;
            System.out.printf("Total: R$ %.2f%n ", total);

        } else {
            System.out.println("Valor não encontrado!");
        }
        input.close();
    }
}
