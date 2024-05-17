package DataeHora;
 
import java.time.LocalDate;
import java.time.Period;
 
public class DiferencaTempo {
    public static void main(String[] args) {
        LocalDate dataInicial = LocalDate.of(2005, 1, 28);
        LocalDate dataFinal = LocalDate.of(2024, 5, 10);
 
        Period diferenca = Period.between(dataInicial, dataFinal);
 
        int anos = diferenca.getYears();
        int meses = diferenca.getMonths();
        int dias = diferenca.getDays();
 
        System.out.println("Diferenca de tempo: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
    }
}
