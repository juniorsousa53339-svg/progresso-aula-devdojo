package exerciciosJornadaDevDojo.exercicioSobreCargaMetrodos.Dominio;

public class LedCode {
    static void main(String[] args) {

        int [] nums = {2,7,11,15};

        int []alvo = {9};

        for(int i = 0; i < nums.length; i++){

            if(nums[i] != alvo[i]){
                nums[i]++;

            } else {
                System.out.println(nums[i]);

            }
        }

    }
}
