package condicoes;

import java.util.Scanner;


public class cond5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero total de cópias: ");
        int numeroCopias = input.nextInt();

        double valorTotal;
        if (numeroCopias <= 100) {
            valorTotal = numeroCopias * 0.25;
        }else{
            int copiasAdicionais = numeroCopias - 100;
            valorTotal = 100 * 0.25 + copiasAdicionais * 0.20;
        }

        System.out.println("O valor a ser pago é R$ " + valorTotal);

        input.close();
    }
}
