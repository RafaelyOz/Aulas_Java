package ativ_ordenados;

import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class Exemplo{
    public static void main(String[] args) {
        
        Set<Integer> numeros = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite cinco números inteiros para adicionar ao conjunto:");
        for(int i = 0; i< 5; i++){
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        if(numeros.contains(30)){
            System.out.println("O numero 30 está presente no conjunto");

        }else{
            System.out.println("O numero 30 não está presente no conjunto.");
        }

        numeros.add(20);
        numeros.add(60);
        numeros.add(70);

        numeros.remove(40);

        System.out.println("Tamamho atual do conjunto " + numeros.size());

        System.out.println("Elemento do conjunto:");
        for(int numero : numeros){
            System.out.println(numero);
        }

         numeros.clear();
         System.out.println("O conjunto foi aprovado.");
    }
}
