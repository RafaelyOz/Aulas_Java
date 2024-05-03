package herança;

public class ativ {
    public static void main(String[] args) {

        Livro livro = new Livro("Beijo na neve", 2023, "Babi A. Sette", 391);
        livro.mostrarDetalhes();

        System.out.println();

        Livro livro2 = new Livro("Biblioteca da Meia Noite", 2020, "Matt Haig,", 308);
        livro2.mostrarDetalhes();

        System.out.println();

        DVD dvd = new DVD("Dealer", 2021, "Indie", 4);
        dvd.mostrarDetalhes();

        System.out.println();

        DVD dvd2 = new DVD("Duality", 2004, "Metal", 4);
        dvd2.mostrarDetalhes();

    }
}

class ItemBiblioteca {
    public String titulo;
    public int anoPublicacao;

    public ItemBiblioteca(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo() {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicaco() {
        this.anoPublicacao = anoPublicacao;
    }

    public void mostrarDetalhes() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Ano Publicação: " + this.anoPublicacao);
    }
}

class Livro extends ItemBiblioteca {
    public String Autor;
    public int NumeroPagina;

    public Livro(String titulo, int anoPublicacao, String Autor, int NumeroPagina) {

        super(titulo, anoPublicacao);
        this.Autor = Autor;
        this.NumeroPagina = NumeroPagina;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Ano Publicação: " + this.anoPublicacao);
        System.out.println("Autor: " + this.Autor);
        System.out.println("Numero de paginas: " + this.NumeroPagina);
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor() {
        this.Autor = Autor;
    }

    public int getNumeroPaginas() {
        return NumeroPagina;
    }

    public void setNumeroPaginas() {
        this.NumeroPagina = NumeroPagina;
    }
}

class DVD extends ItemBiblioteca {
    public String categoria;
    public int duracaoMinutos;

    public DVD(String titulo, int anoPublicacao, String categoria, int duracaoMinutos) {
        super(titulo, anoPublicacao);
        this.categoria = categoria;
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Ano Publicação: " + this.anoPublicacao);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Duração em minutos: " + this.duracaoMinutos);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        this.categoria = categoria;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos() {
        this.duracaoMinutos = duracaoMinutos;
    }
}