
import java.util.Arrays;
import java.util.Collections;
 
public class OrdenacaoArraysDecrescente {
    public static void main(String[] args) {
        
        /* Array original */
        Integer[] array = {5, 2, 8, 1, 6};
        System.out.println("Array original: " + Arrays.toString(array));
 
        /* Ordenacao do array em ordem crescente */
        Arrays.sort(array);
 
        /* Inverter a ordem do array para obter ordem decrescente */
        /* Repare que o array será convertido em uma lista */
        Collections.reverse(Arrays.asList(array));
 
	    /* Array ordenado em ordem decrescente*/
        System.out.println("Array ordenado em ordem decrescente: " + Arrays.toString(array));
    }
}


