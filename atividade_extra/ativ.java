class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double combustivel;
    private double consumoMedio;
 
    public Veiculo(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;
        this.consumoMedio = consumoMedio;
    }
 
    public String getMarca() {
        return marca;
    }
 
    public void setMarca(String marca) {
        this.marca = marca;
    }
 
    public String getModelo() {
        return modelo;
    }
 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
 
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
 
    public double getCombustivel() {
        return combustivel;
    }
 
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
 
    public double getConsumoMedio() {
        return consumoMedio;
    }
 
    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public void calcularAutonomia(){
        return combustivel * consumoMedio;
    }

    public Bollean precisaAbastecimneto(){
        double autonomia = calcularAutonomia();
        if(autonomia < 30){
            return true;
        }else{
            return false;
        }
    }

    public double realizarViagem(double distancia){
        double CombustivelNecessario = distancia / consumoMedio;
        if(combustivel >= CombustivelNecessario){
            combustivel -= CombustivelNecessario;
            System.out.println("Viagem realizada com sucesso! Restaram x litros de combustível no veículo!");
        }else{
            System.out.println("Não foi possível realizar a viagem!");
        }
    }

    public void mostrarDetalhes(){
        System.out.println("Veiculo: " + marca + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano de fabricacao: " + anoFabricacao);
        System.out.println("Autonomia: " + calcularAutonomia(); + "km");
        Sytem.out.println("Precisa de abastecimento? "+ (precisaAbastecimneto() ? "Sim" : "Não"));

    }
}
class  Carro extends Veiculo{
    public Carro 
}
