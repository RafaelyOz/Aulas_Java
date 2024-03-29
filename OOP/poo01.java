 
 
 class ContaCorrente {
    String numeroConta;
    String nomeCorrentista;
    double saldo;

    public ContaCorrente(String numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
    }

    public void deposito(double valor) {
        saldo += valor;
        System.out.println(
                "Depósito de " + valor + " feito na conta de " + nomeCorrentista + ". Saldo atualizado: " + saldo);
    }

    public void saque(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println(
                    "Saque de " + valor + " realizado na conta de " + nomeCorrentista + ". Saldo atualizado: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de " + valor + " na conta de " + nomeCorrentista);
        }
    }

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("12345", "Fulano");

        conta.deposito(1000);
        conta.saque(500);
        conta.saque(600);
    }
}
