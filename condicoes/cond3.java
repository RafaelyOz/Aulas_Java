package condicoes;

import java.util.Scanner;


public class cond3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro");
        int numero = input.nextInt();

        boolean divisivelPor2 = numero % 2 == 0;
        boolean divisivelPor3 = numero % 3 == 0;

        if (divisivelPor2 && divisivelPor3){
            System.out.println(numero + " é divisivel por 2 e por 3");
        }else if (divisivelPor2){
            System.out.println(numero + " é divisivel apenas por 2");
        }else if(divisivelPor3){
                System.out.println(numero + " é divisivel apenas por 3");
            }else {
                System.out.println(numero + " não é divisivel por 2 nem por 3");
            }

            input.close();
        }

    }

