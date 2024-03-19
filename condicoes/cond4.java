package condicoes;

import java.util.Scanner;

public class cond4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro");
        int numero = input.nextInt();

        boolean divisivelPor2 = numero % 2 == 0;
        boolean divisivelPor7 = numero % 7 == 0;

        if (divisivelPor2 && divisivelPor7){
            System.out.println(numero + " é divisivel por 2 e por 7");
        }else if (divisivelPor2){
            System.out.println(numero + " é divisivel apenas por 2");
        }else if(divisivelPor7){
                System.out.println(numero + " é divisivel apenas por 7");
            }else {
                System.out.println(numero + " não é divisivel por 2 nem por 7");
            }

            input.close();

    }
}
