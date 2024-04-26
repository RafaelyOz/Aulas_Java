import java.util.Set;
import java.util.TreeSet;
 
public class ConjuntoDeFrutas {
    public static void main(String[] args) {
        
        /* Criando umm conjunto de frutas. Ao usar TreeSet, os elementos do conjunto estarao sendo inseridos em ordem crescente */
        Set<String> frutas = new TreeSet<>();
        
        /* Adicionando frutas a lista */
        frutas.add("Maca");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Mamao");
        
        /* Tentando adicionar uma fruta que ja existe no conjunto */
        if (frutas.add("Maca")) {
            System.out.println("Maca adicionada ao conjunto");
        } else {
            System.out.println("Maca ja existe no conjunto");
        }
        
        /* Mostrando o tamanho da conjunto */
        System.out.println("Tamanho do conjunto: " + frutas.size());
        
        /* Mostrando os elementos do conjunto - v1 */
        System.out.println("Elementos do conjunto: " + frutas);
        
        /* Mostrando os elementos do conjunto - v2 */
        System.out.println("Elementos do conjunto:");
        for(String elemento : frutas){
            System.out.println(elemento);
        }
        
        /* Verificando se o elemento "Laranja" existe no conjunto */
        if(frutas.contains("Laranja")){
            System.out.println("Laranja existe no conjunto");
        }
        else{
            System.out.println("Laranja nao existe no conjunto");
        }
        
        /* Verificando se o elemento "Laranja" ou "laranja" existe no conjunto, independente do formato em que a palavra foi escrita */
        boolean encontrado = false;
        for (String fruta : frutas) {
            if (fruta.equalsIgnoreCase("Laranja")) {
                encontrado = true;
                break;
            }
        }
 
        if (encontrado) {
            System.out.println("Laranja existe no conjunto");
        } else {
            System.out.println("Laranja nao existe laranja no conjunto");
        }
        
        /* Removendo um elemento do conjunto */
        frutas.remove("Maca");
        System.out.println("Maca foi removida do conjunto");
 
        /* Mostrando os elementos do conjunto */
        System.out.println("Elementos do conjunto: " + frutas);
        
        /* Limpando o conjunto */
        frutas.clear();
        System.out.println("Elementos do conjunto: " + frutas);
    }
}
