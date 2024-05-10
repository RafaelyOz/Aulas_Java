package DataeHora;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
 
public class Exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite um horario no formato hh:mm: ");
        String horaString = scanner.nextLine();
 
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm ");
        
        LocalTime hora = LocalTime.parse(horaString, formato);
        String horaFormatada = hora.format(formato);
        System.out.println("Hora digitada: " + horaFormatada);
    }
}

