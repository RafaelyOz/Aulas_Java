package DataeHora;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
 
class Exemplo {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("Agora e: " + agora.format(formato));
    }
}
