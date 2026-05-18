package ExerciciosB;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private int codigo;
    private String descricao;
    private double valor;



    public Main(int codigo, String descricao, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

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

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Main> lista = new ArrayList<>();


        Main m1= new Main(1, "Cachorro Quente", 4.00);
        lista.add(m1);

        Main m2 = new Main(2, "X-Salada", 4.50);
        lista.add(m2);

        Main m3 = new Main(3, "X-Bacon", 5.00);
        lista.add(m3);

       Main m4 = new Main(4, "Torrada Simples", 2.00);
        lista.add(m4);

        Main m5 = new Main(5, "Refrigerante", 1.50);
        lista.add(m5);

        Scanner input = new Scanner(System.in);

        int opcao = input.nextInt();
        int quantidade = input.nextInt();
        double total = 0;

        if (opcao == 1) {
            total = m1.valor * quantidade;
            System.out.printf("Total: R$ %.2f%n", total);

        } else if (opcao == 2) {
            total = m2.valor * quantidade;
            System.out.printf("Total: R$ %.2f%n", total);

        } else if (opcao == 3) {
            total = m3.valor * quantidade;
            System.out.printf("Total: R$ %.2f%n", total);

        }else if (opcao == 4) {
            total = m4.valor * quantidade;
            System.out.printf("Total: R$ %.2f%n", total);

        } else if (opcao == 5) {
            total = m5.valor * quantidade;
            System.out.printf("Total: R$ %.2f%n", total);

        } else {
            System.out.println("Valor não encontrado!");
        }
        input.close();

    }

}