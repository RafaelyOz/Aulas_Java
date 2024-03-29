package OOP;

    public class poo08 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Azul", false, true);
        Caneta c2 = new Caneta("Fabel", "Vermelho", true, false);
        
        c1.escrever();
        
        c1.status();
        c2.status();
    }
}

class Caneta {
    private String modelo;
    private String cor;
    private float carga; 
    private boolean tampada;
    private boolean escrevendo;
    
    public Caneta(String modelo, String cor, boolean tampada, boolean escrevendo){
        this.modelo = modelo;
        this.cor = cor;
        this.carga = 1;
        this.tampada = tampada; 
        this.escrevendo = escrevendo;
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
    
    public void setCarga(float carga){
        this.carga = carga;
    }

    public float getCarga(){
        return this.carga;
    }
    
    public void setTampada(boolean tampada){
        this.tampada = tampada;
    }
    
    public boolean getTampada(){
        return this.tampada;
    }
    
    public void setEscrevendo(boolean escrevendo){
        this.escrevendo = escrevendo;
    }
    
    public boolean getEscrevendo(){
        return this.escrevendo;
    }
   
    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Tampada: " + this.getTampada());
        System.out.println("Escrevendo: " + this.getEscrevendo());
        System.out.println("");
    }

    public void tampar() {
        if (this.getTampada()) {
            System.out.println("A caneta ja esta tampada.");
        } else {
            this.setTampada(true); 
            System.out.println("A caneta foi tampada.");
        }
    }
    
    public void destampar() {
        if (!this.getTampada()) {
            System.out.println("A caneta ja esta destampada.");
        } else {
            this.setTampada(false); 
            System.out.println("A caneta foi destampada.");
        }
    }
    
    public void escrever() {
        if (!this.getTampada()) {
            this.setEscrevendo(true);
            System.out.println("Escrevendo...");
        } else {
            System.out.println("Erro: A caneta está tampada, destampe-a para escrever.");
        }
    }
}

