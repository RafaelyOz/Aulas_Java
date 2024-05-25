package RevisaoProva;

import java.util.HashMap;
import java.util.Map;

public class mapas {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("Maça", 10);
        mapa.put("Banana", 5);
        mapa.put("Laranja", 8);

        System.out.println("Quantidade de maçãs: " + mapa.get("Maça"));

        for(Map.Entry<String, Integer> entrada : mapa.entrySet()){
            System.out.println("Fruta: " entrada.getKey() + ", Quantidade: " + entrada.getValue());
        }
    }
}
