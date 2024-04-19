class avaliacao {
    public static void main(String[] args) {
        Lampada l1 = new Lampada("Philips", 60);
        Lampada l2 = new Lampada("Osram", 80);
        
        l1.mostrarInformacoes();
        l2.mostrarInformacoes();
    }
}
 
class Lampada{
    public String marca;
    public int potencia;
    public boolean ligada;
    public boolean quebrada;
    
    public Lampada(String marca, int potencia){
        this.marca = marca;
        this.potencia = potencia;
        this.ligada = false;
        this.quebrada = false;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    
    public int getPotencia(){
        return this.potencia;
    }
    
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }
    
    public boolean getLigada(){
        return this.ligada;
    }
    
    public void setQuebrada(boolean quebrada){
        this.quebrada = quebrada;
    }
    
    public boolean getQuebrada(){
        return this.quebrada;
    }
    
    public void mostrarInformacoes(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Potencia: " + this.potencia);
        System.out.println("Ligada: " + this.ligada);
        System.out.println("Quebrada: " + this.quebrada + "\n");
    }
    
    public void ligarLampada(){
        if(quebrada){
            System.out.println("A lampada esta quebrada!");
        }
        else if(ligada){
            System.out.println("A lampada ja esta ligada!\n");
        }
        else{
            System.out.println("A lampada foi ligada!\n");
            this.ligada = true;
        }
    }
    
    public void desligarLampada(){
        if(quebrada){
            System.out.println("A lampada esta quebrada!\n");
        }
        else if(!ligada){
            System.out.println("A lampada ja esta desligada!\n");
        }
        else{
            System.out.println("A lampada foi desligada!\n");
            this.ligada = false;
        }
    }
    
    public void quebrarLampada(){
        if(quebrada){
            System.out.println("A lampada ja esta quebrada!\n");
        }
        else{
            System.out.println("A lampada foi quebrada!\n");
            this.ligada = false;
            this.quebrada = true;
        }
    }
}

