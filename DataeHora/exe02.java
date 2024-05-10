package DataeHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
 
class Exemplo {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Hoje e: " + hoje.format(formato));
    }
}

