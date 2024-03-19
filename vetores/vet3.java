package vetores;
import java.util.Scanner;

public class vet3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float vetor[] = new float[5];
        float soma = 0;
        float media;
        int i;

        for (i = 0; i < 5; i++) {
            System.out.printf("Digite o elemento %d: ", i + 1); 
            vetor[i] = input.nextFloat();
            soma += vetor[i];
        }

        media = soma / 5;

        System.out.println("\nElementos menores que a média:");

        for (i = 0; i < 5; i++) {
            if (vetor[i] < media) {
                System.out.printf("Elemento %d: %.2f\n", i + 1, vetor[i]);
            }
        }

        input.close();
    }
}


