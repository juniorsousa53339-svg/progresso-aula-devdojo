package exerciciosJornadaDevDojo.exercicioFmodificadorEstatico.domian.test;

import exerciciosJornadaDevDojo.exercicioFmodificadorEstatico.domian.Notebook;

public class NotebookTest01 {
    public static void main(String[] args) {

     Notebook.setLimiteArmazenamento(300);

        Notebook n1 = new Notebook("Intel turbo",100);
        Notebook n2 = new Notebook("Intel turbo pro",150);
        Notebook n3 = new Notebook("Intel turbo pro++",200);


        n1.imprimir();
        n2.imprimir();
        n3.imprimir();
    }
}

