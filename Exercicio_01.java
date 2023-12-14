import java.util.Arrays;

public class Exercicio_01 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8};
        int[] resultado = concatenarArrays(array1, array2);
        System.out.println(Arrays.toString(resultado));
    }
    public static int[] concatenarArrays(int[] a, int []b){
        int[] novoArray = new int[a.length * 2];
        for(int i= 0; i < a.length; i++){
            novoArray[i * 2 ] = a[i];
            novoArray[i * 2 + 1] = b[i];
        }
        return novoArray;
    }
}

