/*Crie uma classe que represente uma caneta com os atributos marca, cor, tampada e escrevendo. Crie os métodos tampar, destampar e escrever. Observe que uma caneta tampada não pode escrever.

 */
class Caneta {
    String marca;
    String cor;
    boolean tampada;
    boolean escrevendo;

    public Caneta(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
        this.tampada = true;
        this.escrevendo = false;

    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void escrever() {
        if (!this.tampada) {
            this.escrevendo = true;
            System.out.println("Escrevendo...");
        } else {
            System.out.println("Erro: A caneta está tampada, destampe-a para escrever.");
        }
    }

    public boolean estaTampada() {
        return this.tampada;
    }

    public boolean estaEscrevendo() {
        return this.escrevendo;
    }
}

public class poo06 {
 public static void main(String[] args) {
    Caneta minhaCaneta = new Caneta("BIC", "Azul");

    System.out.println("Minha caneta está tampada? " + minhaCaneta.estaTampada());

    minhaCaneta.destampar();
    minhaCaneta.escrever();

    System.out.println("Minha caneta está tampada? "+ minhaCaneta.estaTampada());
    System.out.println("Minha caneta está escrevendo? "+ minhaCaneta.estaEscrevendo());

    minhaCaneta.tampar();
    minhaCaneta.escrever();
 }
}
