package sequencias;

import java.util.Scanner;

public class exe05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a capacidade do tanque (em litros): ");
        double capacidadeTanque = input.nextDouble();

        System.out.print("Digite a quantidade de litros abastecidos: ");
        double litrosAbastecidos = input.nextDouble();

        System.out.print("Digite a quilometragem percorrida desde o ultimo abastecimento: ");
        double quilometragemPercorrida = input.nextDouble();

        double  consumoMedio = quilometragemPercorrida / litrosAbastecidos;

        double autonomia = (capacidadeTanque - litrosAbastecidos) * consumoMedio;

        System.out.println("O consumo médio de veiculo é: " + consumoMedio + "km/l");
        System.out.println("A autonomia antes de um novo abastecimento é: " + autonomia + "km");

        input.close();

    }
}
