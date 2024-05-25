package RevisaoProva;
import java.util.ArrayList;
import java.util.List;


public class Lista {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Maça");
        lista.add("Banana");
        lista.add("Laranja");

        for(String fruta : lista){
            System.out.println(fruta);
        }
    }
}
