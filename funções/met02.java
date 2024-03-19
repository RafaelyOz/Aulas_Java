package funções;
public class met02 {

    public static double calcularSalario(int nivel, double horasAula) {

        double valorHora = 0;

        switch (nivel) {
            case 1:
                valorHora = 20.00;
                break;
            case 2:
                valorHora = 25.00;
                break;
            case 3:
                valorHora = 30.00;
                break;
            default:
                System.out.println("nivel invalido");
                break;
        }

        return horasAula * valorHora;
    }

    public static void main(String[] args) {

        int nivel = 2;
        double horasAula = 140;

        double salario = calcularSalario(nivel, horasAula);

        System.err.println("O salario do professor: R$ " + salario);

    }
}
