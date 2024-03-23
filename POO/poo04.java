
class Livro {
    String titulo;
    String autor;
    int ano;

    public void status() {
        System.out.printf("Titulo do livro: %s\n", this.titulo);
        System.out.printf("Autor do livro: %s\n", this.autor);
        System.out.printf("Ano do livro: %d\n", this.ano);
    }

}

public class poo04 {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.titulo = "O beijo da neve";
        livro1.autor = "Babi A. Sette";
        livro1.ano = 2023;

        Livro livro2 = new Livro();
        livro2.titulo = "1984";
        livro2.autor = "George Orwell";
        livro2.ano = 1949;

        System.out.println("Informações livro 1:\n");
        livro1.status();

        System.out.println("\nInformações do livro 2:\n");
        livro2.status();

    }
}
