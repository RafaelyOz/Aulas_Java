package List;

import java.util.TreeSet;
import java.util.Set;


public class exe02 {
    public static void main(String[] args) {
            Set<String> frutas = new  TreeSet<>();
        
        frutas.add("Banana");
        frutas.add("Kiwi");
        frutas.add("Laranja");
        frutas.add("Ameixa");
        
    
        System.out.println("Frutas: " + frutas);

        System.out.println("Frutas do conjunto: ");

        for(String elemento : frutas){
            System.out.println(elemento);
        }
        //defini o tamanho da lista
        System.out.println("Tamanho do conjunto: " + frutas.size());


        if(frutas.contains("Ameixa")){
            System.out.println("Ameixa existe no conjunto");
        }else{
            System.out.println("Ameixa não existe no conjunto");
        }

        frutas.remove("Ameixa");
        System.out.println("Frutas: " + frutas);
        // Ignora a escrita da fruta 
        /*for(String elemento : frutas){
            if(elemento.equalsIgnoreCase("Ameixa")){
                System.out.println("Ameixa existe na lista");
            }
        }

        //Removendo A meixa
        frutas.remove("ameixa");
        System.out.println("Frutas: " + frutas);
*/
        //Limpando lista
        frutas.clear();
        System.out.println("Frutas: " + frutas);
    }
}
