package repeticao;
public class rep2 {
    public static void main(String[] args) {

       int i;
       int soma = 0;

       for(i = 1; i <= 100; i++){
        soma = soma + i;
       }

       System.out.printf("O resultado sera de: %d", soma);
    }
}
