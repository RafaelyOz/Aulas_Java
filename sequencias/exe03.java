package sequencias;

import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de latas de 350ml: ");
        int latas = input.nextInt();

        System.out.print("Digite a quantidade de garrafas de 600 ml: ");
        int garrafa600ml = input.nextInt();

        System.out.print("Digite a quantidade de garrafas de 2 litros: ");
        int garrafa2litros = input.nextInt();

        double litrosTotal = (latas * 0.5) + (garrafa600ml * 0.6) + (garrafa2litros * 2);

        System.out.println("Total de litros de refrigerante comprados " + litrosTotal + " litros");

        input.close();
    }
}
