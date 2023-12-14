public class Exercicio_02 {
    public static void main(String[] args) {
        int[][] notasTurma = {
                {9,8,7,8},
                {10,9,8,9},
                {9,8,7,8}
        };
        double suma = 0;

        for(int i = 0; i < notasTurma.length; i++ ){
            double media = 0;
            for(int x = 0; x < notasTurma[i].length; x++){
                media += notasTurma[i][x];
            }
            media = media / notasTurma[i].length;
            System.out.println("Aluno " + (i + 1) + " - Média: " + media);
            suma += media;
        }
        double mediaTurma = suma / notasTurma.length;
        System.out.printf("Média da turma: %.2f", mediaTurma);
    }
}
