package sequencias;

import java.util.Scanner;


public class exe04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a Quantidade de km percorrido: ");
        double kmPercorrido = input.nextDouble();

        System.out.print("Digite a quantidade de dias alugado: ");
        int diaAlugado = input.nextInt();

        double valorPorDias = diaAlugado * 70.0;
        double valorPorKm = kmPercorrido * 0.15;
        double valorTotal = valorPorDias + valorPorKm;

        System.out.println("O valor a pagar será de: " + valorTotal);

        input.close();


    }
}
