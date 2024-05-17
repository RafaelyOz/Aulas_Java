import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
 
public class Estacionamento {
    
    static Map<String, LocalTime> veiculosEstacionados = new HashMap<>();
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("# Estacionamento Alvorada #\n");
            System.out.println("[1] Entrada de veiculo");
            System.out.println("[2] Saida de veiculo");
            System.out.println("[3] Listagem de veiculos");
            System.out.println("[4] Sair");
            System.out.print("\nEscolha uma opcao: ");
            
            int opcao = scanner.nextInt();
            
            /* Limpa o buffer para permitir a entrada de uma string */
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    entradaVeiculo(scanner);
                    break;
                case 2:
                    saidaVeiculo(scanner);
                    break;
                case 3:
                    listarVeiculos();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }
    
    public static void entradaVeiculo(Scanner scanner) {
        if (veiculosEstacionados.size() == 10) {
            System.out.println("Estacionamento lotado!");
            return;
        }
        
        System.out.print("Informe a placa do veiculo: ");
        String placa = scanner.nextLine();
        
        System.out.print("Informe o horario de entrada (hh:mm): ");
        String horarioStringEntrada = scanner.nextLine();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horarioEntrada = LocalTime.parse(horarioStringEntrada, formato);
        
        veiculosEstacionados.put(placa, horarioEntrada);
        
        System.out.println("Veiculo cadastrado com sucesso!");
        System.out.println("Vagas disponiveis: " + (10 - veiculosEstacionados.size()) + "\n" );
    }
    
    public static void saidaVeiculo(Scanner scanner) {
       
        System.out.print("Informe a placa do veiculo: ");
        String placa = scanner.nextLine();
        
        System.out.print("Informe o horario de saida (hh:mm): ");
        String horarioStringSaida = scanner.nextLine();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horarioSaida = LocalTime.parse(horarioStringSaida, formato);
        
        if (veiculosEstacionados.containsKey(placa)) {
            LocalTime horarioEntrada = veiculosEstacionados.get(placa);
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
            
            veiculosEstacionados.remove(placa);
            System.out.println("Vagas disponiveis: " + (10 - veiculosEstacionados.size()));
            System.out.println();
        } else {
            System.out.println("Veiculo nao encontrado!");
        }
    }
    
    public static void listarVeiculos() {
        if(veiculosEstacionados.size() == 0){
             System.out.println("Estacionamento vazio!\n");
             return;
        }
        
        System.out.println("\nPlaca                   Entrada");
        System.out.println("-------------------------------");
        for (Map.Entry<String, LocalTime> entry : veiculosEstacionados.entrySet()) {
            System.out.printf("%-15s %15s\n", entry.getKey(), entry.getValue());
        }
        System.out.println("-------------------------------");
        System.out.println("Vagas disponiveis: " + (10 - veiculosEstacionados.size()) + "\n" );
    }
    
    public static double totalPagar(long minutos){
        double valor = 5;
        
        if(minutos > 60) {
            minutos -= 60;
            valor += (minutos / 15) * 2;
            if(minutos % 15 > 0) {
                valor += 2;
            }
        }
        
        return valor;
    }
}