public class exemplo05 {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Autor 1");
        Autor autor2 = new Autor("Autor 2");

        Livro livro1 = new Livro("Livro 1", 2020, autor1);
        Livro livro2 = new Livro("livro 2", 2018, autor2);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.AdicionarLivro(livro1);
        biblioteca.AdicionarLivro(livro2);

        biblioteca.mostrarLivros();
    }
}

    class Biblioteca {
        private Livro[] livros;
        private int NumLivros;

        public Biblioteca() {
            this.livros = new Livro[100];
            this.NumLivros = 0;
        }

        public void AdicionarLivro(Livro livro) {
            if (NumLivros < 100) {
                livros[NumLivros++] = livro;
                System.out.println("Livro adicionado a biblioteca " + livro.getNomeLivro());
            } else {
                System.out.println("A biblioteca está lotada, não é possivel adicionar mais livros");
            }

        }

        public void mostrarLivros(){
            System.out.println("\nLivros na biblioteca:");
            for( int i = 0; i < NumLivros; i++){
                Livro livro = livros[i];
                System.out.println("Titulo: " +  livro.getNomeLivro() + ", Ano " + livro.getAno() + ", Autor: " + livro.getAutor().getNomeAutor());
            }
        }
    }

    class Autor {
        private String NomeAutor;

        public Autor(String NomeAutor) {
            this.NomeAutor = NomeAutor;
        }

        public String getNomeAutor() {
            return NomeAutor;
        }

    }

    class Livro {
        private String NomeLivro;
        private int Ano;
        private Autor autor;

        public Livro(String NomeLivro, int Ano, Autor autor) {
            this.NomeLivro = NomeLivro;
            this.Ano = Ano;
            this.autor = autor;
        }

        public String getNomeLivro() {
            return NomeLivro;
        }

        public int getAno() {
            return Ano;
        }

        public Autor getAutor() {
            return autor;
        }

    }

