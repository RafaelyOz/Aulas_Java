package condicoes;

import java.util.Scanner;


public class cond1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro ");
        int numero1 = input.nextInt();

        System.out.print("Digite outro numero inteiro ");
        int numero2 = input.nextInt();

        if (numero1 < numero2) {
    
            System.out.printf("%d %d", numero1, numero2);
        }else{
            System.out.printf("%d %d", numero2, numero1);
        }

        input.close();
    }
}
