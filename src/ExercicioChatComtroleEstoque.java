public class ExercicioChatComtroleEstoque {
    public static void main(String[] args) {

        int[] temp = {20, 35, 45, 40, 3, 9, 2};

        int dia = 1;
        int diasFrios = 0;
        int diasQuentes = 0;
        int soma = 0;
        int maior = temp[0];
        int menor = temp[0];

        System.out.println("\n---TEMPERATURAS DA SEMANA---\n");
        for (int t : temp) {
            System.out.println("Dia " + dia + ": " + t + "°C");
            System.out.println("-------------------------------------");

            if (t > 30) diasQuentes++;
            if (t < 15) diasFrios++;

            soma += t;
            if (t > maior) maior = t;
            if (t < menor) menor = t;

            dia++;
        }

        double media = (double) soma / temp.length;

        System.out.println("\nDIAS QUENTES: " + diasQuentes);
        System.out.println("DIAS FRIOS: " + diasFrios);
        System.out.println("MÉDIA: " + media);
        System.out.println("MAIOR TEMPERATURA: " + maior);
        System.out.println("MENOR TEMPERATURA: " + menor);
    }
}
