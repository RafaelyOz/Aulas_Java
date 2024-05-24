import java.util.Scanner;

public class CalculadoraFinanciamento {

    public double calcularValorTotalJurosSimples(double valorFinanciado, double taxaJuros, int numParcelas) {
        return valorFinanciado + (valorFinanciado * taxaJuros * numParcelas);
    }

    public double calcularValorTotalJurosCompostos(double valorFinanciado, double taxaJuros, int numParcelas) {
        return valorFinanciado * Math.pow((1 + taxaJuros), numParcelas);
    }

    public double calcularParcelas(double valorTotal, int numParcelas) {
        return valorTotal / numParcelas;
    }

    public double obterValorFinanciado(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Digite o valor financiado: ");
                double valor = Double.parseDouble(scanner.nextLine());
                if (valor <= 0) {
                    throw new IllegalArgumentException("O valor financiado deve ser positivo.");
                }
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public double obterTaxaJuros(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Digite a taxa de juros mensal (em %): ");
                double taxa = Double.parseDouble(scanner.nextLine()) / 100;
                if (taxa <= 0) {
                    throw new IllegalArgumentException("A taxa de juros deve ser positiva.");
                }
                return taxa;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int obterNumParcelas(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Digite o número de parcelas: ");
                int numParcelas = Integer.parseInt(scanner.nextLine());
                if (numParcelas <= 0) {
                    throw new IllegalArgumentException("O número de parcelas deve ser positivo.");
                }
                return numParcelas;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraFinanciamento calculadora = new CalculadoraFinanciamento();

        System.out.println("Calculadora de Financiamento");

        double valorFinanciado = calculadora.obterValorFinanciado(scanner);
        double taxaJuros = calculadora.obterTaxaJuros(scanner);
        int numParcelas = calculadora.obterNumParcelas(scanner);

        String tipoJuros = "";
        while (true) {
            System.out.print("Escolha o tipo de juros (simples/compostos): ");
            tipoJuros = scanner.nextLine().trim().toLowerCase();
            if (tipoJuros.equals("simples") || tipoJuros.equals("compostos")) {
                break;
            } else {
                System.out.println("Opção inválida. Escolha entre 'simples' ou 'compostos'.");
            }
        }

        double valorTotal = 0;
        if (tipoJuros.equals("simples")) {
            valorTotal = calculadora.calcularValorTotalJurosSimples(valorFinanciado, taxaJuros, numParcelas);
        } else {
            valorTotal = calculadora.calcularValorTotalJurosCompostos(valorFinanciado, taxaJuros, numParcelas);
        }

        double valorParcela = calculadora.calcularParcelas(valorTotal, numParcelas);

        System.out.printf("\nResumo do Financiamento:\n");
        System.out.printf("Valor Financiado: R$ %.2f\n", valorFinanciado);
        System.out.printf("Valor dos Juros: R$ %.2f\n", (valorTotal - valorFinanciado));
        System.out.printf("Valor Total a Pagar: R$ %.2f\n", valorTotal);
        System.out.printf("Quantidade de Parcelas: %d\n", numParcelas);
        System.out.printf("Valor de Cada Parcela: R$ %.2f\n", valorParcela);

        scanner.close();
    }
}
