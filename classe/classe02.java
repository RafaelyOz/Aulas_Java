package classe;

class Conta{
    String nome;
    double saldo = 0;

    public void status(){
        System.out.printf("Nome: %s", this.nome);
        System.out.printf("\nSaldo:%.2f\n " , this.saldo);
        
    }
    public void deposito(double valor){
        this.saldo += valor;
        this.status();
    }

    public void saque(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            this.status();
            
        }
        else{
            System.out.printf("nao ha saldo suficiente");
        }
    }
    
}

public class classe02 {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.nome = "Marcelo";
        
        Conta c2 = new Conta();
        c2.nome = "Leandro";

        c1.status();
        c1.deposito(234.50);
        c1.deposito(456);
        c1.saque(200);

        c2.status();
    }
}
