import java.util.Arrays;
 
public class OrdenacaoArrays {
    public static void main(String[] args) {
        
	    /* Array original */
        int[] array = {5, 2, 8, 1, 6};
        System.out.println("Array original: " + Arrays.toString(array));
 
        /* Array ordenado */
        Arrays.sort(array);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }
}