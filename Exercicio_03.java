import java.util.Arrays;

public class Exercicio_03 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4};
        ;
        int acumulador = 0;

        for (int i = 0; i < numeros.length; i++) {
            acumulador += numeros[i];
            numeros[i] = acumulador;
        }

        System.out.println(Arrays.toString(numeros));
    }
}
