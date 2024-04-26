package ativ_ordenados;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class VerificarNumero{
    public static void main(String[] args) {
        
    List<Integer> numeros = new ArrayList<>();

    numeros.add(1);
    numeros.add(10);
    numeros.add(20);
    numeros.add(21);
    numeros.add(30);
    numeros.add(40);
    numeros.add(50);

    System.out.println("numeros:" + numeros);

    if (numeros.contains(30)) {
        System.out.println("O número 30 está presente na lista");
    }else{
        System.out.println("O número 30 não está presente na lista");
    }

    if(numeros.contains(15)){
        System.out.println("O número 15 está presente na lista");
    }else{
        System.out.println("O número 15 não está presente na lista");
    }
        numeros.add(60);

        System.out.println("numeros:" + numeros);
    

    Collections.sort(numeros);
    System.out.println("Lista ordenada em ordem crescente: " + numeros);

    Collections.sort(numeros, Collections.reverseOrder());
    System.out.println("Lista ordenada em ordem decrescente: " + numeros);

    List<Integer> numerosPares = new ArrayList<>();


    for(int num : numeros){
        if(num % 2 == 0){
            numerosPares.add(num);
        }
    }
    System.out.println("Lista numeros pares: "+ numerosPares);

        numeros.clear();
        numerosPares.clear();

        System.out.println("Limpeza da lista numeros: " + numeros);
        System.out.println("Limpeza da lista numeros  pares: " + numerosPares);
}
}