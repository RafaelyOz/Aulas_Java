package RevisaoProva;
import java.util.HashSet;
import  java.util.Set;

public class Conjuntos {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Maçã");
        conjunto.add("Banana");
        conjunto.add("Maçã"); // Não será adicionada, pois conjuntos não permitem duplicatas
        
        // Acessando elementos do conjunto
        for (String fruta : conjunto) {
            System.out.println(fruta);
        }
    }
}
