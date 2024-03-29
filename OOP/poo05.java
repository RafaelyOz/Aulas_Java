import javax.sound.midi.SysexMessage;

class Calculadora {

    public static double adicionar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisao(double num1, double num2) {

        if (num2 == 0) {
            System.out.println("Erro divisao por zero");
            return Double.NaN;
        } else {
            return num1 / num2;
        }
    }
}

public class poo05 {
    public static void main(String[] args) {
         
        double num1 = 9;
        double num2 = 8;

        System.out.println("\nSoma: " + Calculadora.adicionar(num1, num2));
        System.out.println("\nSubtração: " + Calculadora.subtrair(num1, num2));
        System.out.println("\nMultiplicação: " + Calculadora.multiplicacao(num1, num2));
        System.out.println("\nDivisão: " + Calculadora.divisao(num1, num2));
       
    }
}
