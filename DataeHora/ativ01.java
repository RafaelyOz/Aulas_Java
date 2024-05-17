import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.util.Scanner;
 
public class Exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a placa do veiculo: ");
        String placa = scanner.nextLine();
        
        System.out.print("Informe o horario de entrada (hh:mm): ");
        String horarioStringEntrada = scanner.nextLine();
        
        System.out.print("Informe o horario de saida (hh:mm): ");
        String horarioStringSaida = scanner.nextLine();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        
        LocalTime horarioEntrada = LocalTime.parse(horarioStringEntrada, formato);
        
        LocalTime horarioSaida = LocalTime.parse(horarioStringSaida, formato);
        
        Duration diferenca = Duration.between(horarioEntrada, horarioSaida);
        
        long minutos = diferenca.toMinutes();
        
        System.out.println("------------------------------");
        System.out.println("Recibo");
        System.out.println("------------------------------");
        System.out.println("Placa: " + placa);
        System.out.println("Entrada: " + horarioEntrada);
        System.out.println("Saida: " + horarioSaida);
        System.out.println("Tempo total (em minutos): " + minutos);
        System.out.println("Total a pagar: R$ " + totalPagar(minutos));
        System.out.println("------------------------------");
    }
    
    public static double totalPagar(long minutos){
        double valor = 5;
        
        if(minutos > 60){
                            
            minutos -= 60;
                            
            if(minutos % 15 > 0){
                valor += (minutos / 15 * 2) + 2;
            }
            else{
                valor += (minutos / 15 * 2);
            }
        }
 
        return valor;
    }
}