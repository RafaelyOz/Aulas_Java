package condicoes;

import java.util.Scanner;

public class cond2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("informe o primeiro numero ");
        int numero1  = input.nextInt();
        int menor = numero1;

        System.out.print("informe o segundo numero ");
        int numero2  = input.nextInt();
        if (numero2 < menor) {
            menor = numero2;
        }

        System.out.print("informe o terceiro numero ");
        int numero3  = input.nextInt();

        if (numero3 < menor) {
            menor = numero3;
        }


        System.out.printf("o menor numero é %d",menor);

        input.close();
    }
}
