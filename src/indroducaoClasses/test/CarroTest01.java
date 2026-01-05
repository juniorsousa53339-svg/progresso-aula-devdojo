package indroducaoClasses.test;

import indroducaoClasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {


        /// Objetos
        Carro Carro01 = new Carro();
        Carro Carro02 = new Carro();
        Carro Carro03 = new Carro();

        // imformações Carro01
        Carro01.marca = "BMW";
        Carro01.modelo = "BMW X1";
        Carro01.ano = 2016;

        // imformações Carro02
        Carro02.marca = "BMW";
        Carro02.modelo = "BMW X2";
        Carro02.ano = 2017;

        // (Carro 3) recebe as mesmas informações de (Carro 1)
        Carro03 = Carro01;

        // Imprimindo carro01
        System.out.println(
                "\n ---Carro (1)---" +
                       "\nMarca: " +Carro01.marca + "\n"+
                        "Modelo: " +Carro01.modelo + "\n" +
                        "Ano: " +Carro01.ano + "\n"
        );

        System.out.println("------------");

        // Imprimindo carro02
        System.out.println(
                "\n ---Carro (2)---" +
                       "\nMarca: " +Carro02.marca + "\n"+
                        "Modelo: " +Carro02.modelo + "\n" +
                        "Ano: " +Carro02.ano + "\n"
        );System.out.println("------------");

        // Imprimindo carro03
        System.out.println(
                "\n ---Carro (3)---" +
                       "\nMarca: " +Carro03.marca + "\n"+
                        "Modelo: " +Carro03.modelo + "\n" +
                        "Ano: " +Carro03.ano + "\n"
        );
    }
}
