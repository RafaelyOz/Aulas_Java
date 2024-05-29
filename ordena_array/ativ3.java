import java.util.Arrays;

public class AtivBubbleSort {
    public static void main(String[] args) {
        // Inicialize o vetor com alguns valores
        int[] vetor = {5, 2, 9, 1, 5};

        bubbleSort(vetor);

        // Imprime o vetor ordenado
        System.out.println(Arrays.toString(vetor));
    }

    public static void bubbleSort(int[] vetor) {
        int aux;
        int n = vetor.length;

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (vetor[j - 1] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = aux;
                }
            }
        }
    }
}
