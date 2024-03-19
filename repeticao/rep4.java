package repeticao;

import java.util.Scanner;
public class rep4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;
         System.out.print("Digite um numero");
         int num = input.nextInt();

         while (num != 0) {
            soma = soma + num;
            System.out.print("Digite um numero");
             num = input.nextInt();
         }

         System.out.printf("Resultado: %d", soma);
    }
}
