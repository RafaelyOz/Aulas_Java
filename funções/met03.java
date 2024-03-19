package funções;
public class met03 {

    public static double CalcularEnergia(double kwConsumido, String tipoPessoa) {

        double valorKw = 0;

        switch (tipoPessoa) {
            case "pessoa fisica":
                valorKw = 0.60;
                break;
            case "comercio":
                valorKw = 0.48;
                break;
            case "industria":
                valorKw = 1.29;
                break;
            default:
                System.out.println("tipo de cliente invalido");
                break;

        }

        return kwConsumido * valorKw;

    }

    public static void main(String[] args) {

        String tipoPessoa = "industria";
        double kwConsumido = 700;

        double contaPagar = CalcularEnergia(kwConsumido, tipoPessoa);

        System.out.print("O valor da conta será: " + contaPagar);
    }
}
