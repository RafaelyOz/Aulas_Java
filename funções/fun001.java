package funções;
public class fun001 {

    public static void linha(int quant, char caractere){

        for(int i = 1; i <= quant; i++){
            System.out.printf("%c",caractere);
        }

    }


    public static void main(String[] args) {

       linha(12, '*');

        System.out.printf("\n");

        System.out.printf("Numeros de 1 a 5: ");

        System.out.printf("\n");

        linha(20, '!');

        System.out.printf("\n");

        for(int i = 1; i <= 5; i++){
            System.out.printf("%d", i);
        }

        System.out.printf("\n");

        linha(13, '#');
    }
}
