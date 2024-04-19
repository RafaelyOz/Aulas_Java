class avaliacao {
    public static void main(String[] args) {
        Carro c1 = new Carro("Gol", "Vermelho", 2023, 160);
        Carro c2 = new Carro("Sandero", "Branco", 2015, 140);
        
        c1.mostrarInformacoes();
        c2.mostrarInformacoes();
    }
}
 
class Carro{
    public String modelo;
    public String cor;
    public int ano;
    public int velocidadeMaxima;
    public int velocidadeAtual;
    
    public Carro(String modelo, String cor, int ano, int velocidadeMaxima){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public void setVelocidadeMaxima(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public int getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }
    
    public void setVelocidadeAtual(int velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;
    }
    
    public int getVelocidadeAtual(){
        return this.velocidadeAtual;
    }
    
    public void mostrarInformacoes(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade atual: " + this.velocidadeAtual + "\n");
    }
    
    public void aumentarVelocidade(){
        if(this.velocidadeAtual == this.velocidadeMaxima){
            System.out.println("O veiculo ja esta em sua velocidade maxima.");
        }
        else{
            this.velocidadeAtual += 10;
        }
    }
    
    public void diminuirVelocidade(){
        if(this.velocidadeAtual == 0){
            System.out.println("O veiculo esta parado.");
        }
        else{
            this.velocidadeAtual -= 10;
        }
    }
}