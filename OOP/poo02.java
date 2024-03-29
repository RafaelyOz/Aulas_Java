
class Pessoa {
    String nome;
    int idade;
    double peso;
    double altura;

    public void status() {
        System.out.printf("\nNome: %s", this.nome);
        System.out.printf("\nIdade: %d", this.idade);
        System.out.printf("\npeso: %.1f", this.peso);
        System.out.printf("\naltura: %.2f\n", this.altura);
    }

    public void envelhecer() {
        this.idade++;

        if (this.idade < 21) {
            this.altura += 0.01;
        } 
    }
    
    public void engordar(double quilos){
        this.peso += quilos;
    }

    public void emagrecer(double quilos){
        this.peso -= quilos;
    }
}

public class poo02 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Marcelo Fassina";
        p1.idade = 55;
        p1.peso = 84;
        p1.altura = 1.82;

        p1.status();
        p1.envelhecer();
        p1.engordar(5);
        p1.status();
        p1.emagrecer(12);
        p1.status();

        /*
         * Pessoa p2 = new Pessoa();
         * p2.nome = "Joao Pedro";
         * p2.idade = 24;
         * p2.peso = 77;
         * p2.altura = 1.90;
         * 
         * p2.status();
         */

    }
}
