package exerciciosJornadaDevDojo.exercicioFmodificadorEstatico.domian;

public class Notebook {

    private String modelo;
    private double armazenamento;
    private static double limiteArmazenamento = 200;


    public Notebook(String modelo, double armazenamento) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    public void imprimir() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Armazenamento: " + this.armazenamento);
        System.out.println("Limite de GB permitido na empresa: " + Notebook.limiteArmazenamento);
        System.out.println("------------------------");
    }

    public static double setLimiteArmazenamento(double limite) {
        Notebook.limiteArmazenamento = limite;
        return limite;
    }

    public static  double getVelecidadeLimite() {
        return Notebook.limiteArmazenamento;
    }
}

