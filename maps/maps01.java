package maps;

import java.util.Map;
import java.util.TreeMap;
 
public class Main {
    public static void main(String[] args) {
        
        /* Cria o TreeMap */
        Map<String, Integer> frutas = new TreeMap<>();
 
        /* Adiciona frutas e suas quantidades em estoque */
        frutas.put("Maca", 50);
        frutas.put("Banana", 100);
        frutas.put("Laranja", 75);
        
        /* Exibe o tamanho do mapa */
        System.out.println("Tamanho do mapa: " + frutas.size() +"\n");
        
        /* Exibe o estoque de frutas */
        mostrarEstoque(frutas);
        
        /* Verifica se uma fruta esta no estoque */
        if (frutas.containsKey("Maca")) {
            System.out.println("Maca ja esta no estoque.\n");
        } else {
            System.out.println("Maca nao esta no estoque.\n");
        }
        
        /* Atualiza a quantidade de macas no estoque */
        frutas.put("Maca", 60);
 
        /* Exibe o estoque de frutas */
        mostrarEstoque(frutas);
        
        /* Remove uma fruta do estoque */
        frutas.remove("Maca");
        
        /* Exibe o estoque de frutas */
        mostrarEstoque(frutas);
 
        /* Limpa o mapa*/
        frutas.clear();
 
        /*Exibe o estoque apos a limpeza */
        mostrarEstoque(frutas);
    }
 
    /* Metodo para exibir o estoque de frutas */
    public static void mostrarEstoque(Map<String, Integer> estoque) {
        
        System.out.println("Estoque de Frutas:");
        
        if (estoque.isEmpty()) {
            System.out.println("O estoque esta vazio.");
        } else {
            for (Map.Entry<String, Integer> fruta : estoque.entrySet()) {
                System.out.println("Fruta: " + fruta.getKey() + ", Quantidade: " + fruta.getValue());
            }
        }
        System.out.println();
    }
}

