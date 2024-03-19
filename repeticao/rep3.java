package repeticao;

import java.util.Scanner;


public class rep3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i;
        int quant = 0;

        System.out.print("Digite um numero ");
        int num = input.nextInt();

        for(i = 1; i<=num; i++){
            if (i % 2 == 0) {
                System.out.printf("%d\n",i);
                quant++;
            }
        }
        System.out.printf("Quantidade de numeros representados: %d",quant);
        input.close();
    }
}
