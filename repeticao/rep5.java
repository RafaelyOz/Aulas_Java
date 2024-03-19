package repeticao;

import java.util.Scanner;
public class rep5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a tabuada desejada ");
        int tabuada = input.nextInt();

        for(int i = 1; i <= 10; i++){

            System.out.printf("%d x %d = %d\n",tabuada,i,i*tabuada);
        }
    }
}
