import java.util.Arrays;

public class AtivSort {
    public static void main(String[] args) {
        // Inicialize o vetor com alguns valores
        int[] vetor = {5, 2, 9, 1, 5};

        insertionSort(vetor);

        // Imprime o vetor ordenado
        System.out.println(Arrays.toString(vetor));
    }

    public static void insertionSort(int[] vetor) {
        int i, j, elemento;

        for (j = 1; j < vetor.length; j++) {
            elemento = vetor[j];
            i = j - 1;

            while (i >= 0 && vetor[i] > elemento) {
                vetor[i + 1] = vetor[i];
                i = i - 1;
            }
            vetor[i + 1] = elemento;
        }
    }
}
