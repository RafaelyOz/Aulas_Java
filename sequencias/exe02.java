package sequencias;

//antecessor e sucessor

import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = input.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor de " + numero + " é " + antecessor);
        System.out.println("O sucessor de "+ numero + " é " + sucessor);

        input.close();

    }
}
