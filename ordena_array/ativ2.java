import java.util.Arrays;

public class AtivSeleSort {
    public static void main(String[] args) {
        // Inicialize o vetor com alguns valores
        int[] vetor = {5, 2, 9, 1, 5};

        selectionSort(vetor);

        // Imprime o vetor ordenado
        System.out.println(Arrays.toString(vetor));
    }

    public static void selectionSort(int[] vetor) {
        int i, j, menor, aux;

        for (i = 0; i < vetor.length - 1; i++) {
            menor = i;

            for (j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }

            // Troca os elementos
            aux = vetor[menor];
            vetor[menor] = vetor[i];
            vetor[i] = aux;
        }
    }
}
