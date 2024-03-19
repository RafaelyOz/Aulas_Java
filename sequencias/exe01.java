package sequencias;
import java.util.Scanner;
class atividade_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe quantidade de horas: ");
        int horas = input.nextInt();
        
        System.out.print("Informe quantidade de minutos: ");
        int minutos = input.nextInt();
        
        System.out.print("Informe quantidade de segundos: ");
        int segundos = input.nextInt();
        
        int total_segundos = horas * 3600 + minutos * 60 + segundos;
        
        System.out.print("total segundos: " + total_segundos);
        
        input.close();
        
    }
}