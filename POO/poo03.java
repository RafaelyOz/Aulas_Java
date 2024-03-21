class Bomba{
    int numeroBomba;
    String tipoCombustivel;
    double valoCombustivel;
    double quantidadeCombustivel;

    public void status(){
        System.out.printf("\nnumero da bomba: %d",this.numeroBomba);
        System.out.printf("\ntipo combustivel: %s", this.tipoCombustivel);
        System.out.printf("\nvalor do litro: %.2f", this.valoCombustivel);
        System.out.printf("\nquantidade de combustivel: %.2f\n", this.quantidadeCombustivel);
    }

    public void abastecer_valor(double valor){
        double litros = valor / this.valoCombustivel;
        System.out.printf("\nForam abastecidos %.1f litros\n", litros);
        this.quantidadeCombustivel -= litros;

    }

    public void abastecer_litros(double litros){
      
        System.out.printf("\nValor a pagar: %.2f", litros * this.valoCombustivel);
        this.quantidadeCombustivel -= litros;

    }

    public void alterar_valor(double valor){
        this.valoCombustivel = valor;
    }

    public void alterar_quantidade(double quantidade){
        this.quantidadeCombustivel = quantidade;
    }
}

public class poo03 {
    public static void main(String[] args) {

        Bomba b1 = new Bomba();
        b1.numeroBomba = 1;
        b1.tipoCombustivel = "Gasolina";
        b1.valoCombustivel = 6.29;
        b1.quantidadeCombustivel = 10000;

        b1.status();
        // b1.abastecer_valor(50);
        //b1.abastecer_litros(80);
        b1.alterar_valor(1.5);
        b1.alterar_quantidade(500);
        b1.status();

    }
}
