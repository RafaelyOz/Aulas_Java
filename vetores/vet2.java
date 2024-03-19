package vetores;

import java.util.Scanner;
public class vet2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vetor[] = new int[5];

        for(int i = 0; i < 5; i++){
        System.out.printf("Digite 5 numeros inteiros[%d]\n",i);
        vetor[i] = input.nextInt();
        }

        for(int i = 4; i >= 0; i--){
            System.out.printf("\nElemento %d: %d", i + 1, vetor[i]);
        }
        input.close();
    }

}
