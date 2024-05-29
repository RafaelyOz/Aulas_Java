import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
 
public class OrdenacaoListasDecrescente {
    public static void main(String[] args) {
        
        /* Lista original */
        List<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("Joao");
        nomes.add("Ana");
        System.out.println("Lista original: " + nomes);
 
        /* Lista ordenada em ordem crescente */
        Collections.sort(nomes);
 
        /* Inverter a ordem da lista para obter ordem decrescente */
        Collections.reverse(nomes);
 
	    /* Lista ordenada em ordem decrescente */
        System.out.println("Lista ordenada em ordem decrescente: " + nomes);
    }
}