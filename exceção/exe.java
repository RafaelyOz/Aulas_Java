package exceção;
import java.util.concurrent.ExecutionException;

public class Exemplo {
    public static void main(String[] args) {
        int numeros[] = {10, 20, 30, 100};
        int pesos[] = {2, 0, 4};
        System.out.println("Numeros");
      
        Matematica matematica = new Matematica();

      
        try{
                System.out.printf("%d / %d = %d", numeros[i], pesos[i], numeros[i]/pesos[i]);
                matematica.dividir(numeros[i],pesos[i]);
           /* }catch(ArithmeticException e){
               System.out.println("Erro matematico: " +  e.getMessage());
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Erro de vetor: " + e.getMessage());
            }*/
            catch(Exception e){
                System.out.println(e.getMessage());
            }finally{
            System.out.println("sempre executado");
            }
        }
    }
}

class Matematica{
    public static void dividir(int num1, int num2) {
        System.out.printf("%d / %d = %d\n", num1, num2,num1/num2);
    }
}