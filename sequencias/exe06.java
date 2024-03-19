package sequencias;

import java.util.Scanner;

public class exe06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe valor saque: ");
        int valor_saque = input.nextInt();

         System.out.printf("%d cedulas de 100. ",valor_saque /100); 
         valor_saque =  valor_saque % 100;

         System.out.printf("\n%d cedulas de 50. ",valor_saque /50); 
         valor_saque = valor_saque % 50;

         System.out.printf("\n%d cedulas de 20. ",valor_saque /20); 
         valor_saque = valor_saque % 20;

         System.out.printf("\n%d cedulas de 10. ",valor_saque /10); 
         valor_saque = valor_saque % 10;

         System.out.printf("\n %d cedulas de 5. ",valor_saque /5); 
        


        input.close();
    }
}
