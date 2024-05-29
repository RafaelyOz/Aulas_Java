import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
 
public class OrdenacaoListas {
    public static void main(String[] args) {
        
        /* Lista original */
        List<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("Joao");
        nomes.add("Ana");
        System.out.println("Lista original: " + nomes);
 
        /* Lista ordenada */
        Collections.sort(nomes);
        System.out.println("Lista ordenada: " + nomes);
    }
}
