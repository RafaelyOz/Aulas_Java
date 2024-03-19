package repeticao;
import java.util.Scanner;
public class rep6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int atual, anterior, auxiliar, i;

        anterior = 1;
        atual = 1;

        System.out.printf("%d %d",atual,anterior);

        for(i = 3; i <= 10; i++){
            auxiliar = atual;
            atual = atual + anterior;
            anterior = auxiliar;
        }
        System.out.printf("%d", atual);

        input.close();
    }
}
