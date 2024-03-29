public class ativ {
    public static void main(String[] args) {

        // Teste para verificar os métodos.
        // Teste fecharConta()
        System.out.println("Teste fecharConta():");
        Conta conta1 = new Conta();
        conta1.abrirConta(123, "CC", "Rafaely Obzut");
        conta1.sacar(50);
        conta1.fecharConta();
        System.out.println();

        // Teste depositar()
        System.out.println("Teste depositar():");
        Conta conta2 = new Conta();
        conta2.abrirConta(456, "CP", "João Figueredo");
        conta2.depositar(100);
        System.out.println();

        // Teste sacar()
        System.out.println("Teste sacar():");
        Conta conta3 = new Conta();
        conta3.abrirConta(789, "CC", "Laura da Silva");
        conta3.depositar(70);
        conta3.sacar(115);
        System.out.println();

        // Teste pagarMensalidade()
        System.out.println("Teste pagarMensalidade():");
        Conta conta4 = new Conta();
        conta4.abrirConta(114, "CP", "Paulo Costa");
        conta4.depositar(70);
        conta4.pagarMensalidade();
        System.out.println();
    }
}

class Conta {
    public int numeroConta;
    protected String tipoConta;
    private String titularConta;
    private float saldo;
    private boolean status;

    public Conta() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public String getTitularConta() {
        return this.titularConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void abrirConta(int numeroConta, String tipoConta, String titularConta) {
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.titularConta = titularConta;
        this.status = true;

        tipoConta = tipoConta.toUpperCase();

        if (tipoConta.equals("CC")) {
            this.tipoConta = "CC";
            this.saldo = 50;

        } else if (tipoConta.equals("CP")) {
            this.tipoConta = "CP";
            this.saldo = 150;
        } else {
            System.out.println("Tipo de conta inválido. A conta não foi aberta");
            this.status = false;
        }

        if (this.status) {
            System.out.println("A conta foi aberta com sucesso! Seu saldo inicial é: " + this.saldo);
        }
    }

    public void fecharConta() {
        if (this.status) {
            if (this.saldo == 0) {
                this.status = false;
                System.out.println("Conta fechada com sucesso.");
            } else if (this.saldo < 0) {
                System.out.println("Não foi possível fechar a conta. O saldo é negativo.");
            } else {
                System.out.println("Não foi possível fechar a conta. O saldo não é zero.");
            }
        } else {
            System.out.println("Não foi possível fechar a conta. A conta já está fechada.");
        }
    }

    public void depositar(float valor) {
        if (this.status) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso. Numero da conta: " + this.numeroConta + ", Titular: "
                    + this.titularConta + ",  novo saldo: " + this.saldo);
        } else {
            System.out.println("Não foi possível depositar. A conta está fechada.");
        }
    }

    public void sacar(float valor) {
        if (this.status) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso. Numero da conta: " + this.numeroConta + ", Titular: "
                        + this.titularConta + ", novo saldo: " + this.saldo);
            } else {
                System.out.println("Saldo insuficiente para realizar o saque");
            }
        } else {
            System.out.println("Não é possível sacar. A conta está fechada.");
        }
    }

    public void pagarMensalidade() {
        this.tipoConta = this.tipoConta.toUpperCase();
        if (this.status) {
            float mensalidade;
            if (this.tipoConta.equals("CC")) {
                mensalidade = 12;
            } else {
                mensalidade = 20;
            }

            if (this.saldo >= mensalidade) {
                this.saldo -= mensalidade;
                System.out.println("Mensalidade paga com sucesso. Numero da conta: " + this.numeroConta + ", Titular: "
                        + this.titularConta + ", novo saldo: " + this.saldo);
            } else {
                System.out.println("Saldo insuficiente para pagar a mensalidade");
            }
        } else {
            System.out.println("Não foi possível pagar a mensalidade. A conta está fechada.");
        }
    }

}
