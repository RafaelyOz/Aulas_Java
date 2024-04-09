public class aula002 {
    public static void main(String[] args) {
        Autor autor01 = new Autor("Machado de Assis", "Brasileira");
        Livro livro01 = new Livro("Quincas Borba", 1891, autor01);

        Autor autor02 = new Autor("George Orwell", "Britanica");
        Livro livro02 = new Livro("A revolucao dos Bichos", 1945, autor02);

        Autor autor03 = new Autor("Fracis Hodgson Burnett", "Britanica");
        Livro livro03 = new Livro("Jardim Secreto", 1911, autor03);

        Autor autor04 = new Autor("Lucy Maud Montgomery", "Canadense");
        Livro livro04 = new Livro("Anne de Green Gables", 1908, autor04);


        livro01.ImprimirDetalhes();
        livro02.ImprimirDetalhes();
        livro03.ImprimirDetalhes();
        livro04.ImprimirDetalhes();
    }
}
class Autor{
    public String nomeAutor;
    public String nacionalidade;

    public Autor(String nomeAutor, String nacionalidade){
        this.nomeAutor = nomeAutor;
        this.nacionalidade = nacionalidade;
    }

    public String getNomeAutor(){
        return nomeAutor;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }
}

class Livro{
    public String Titulo;
    public int AnoPublicacao;
    public Autor autor;

    public Livro(String Titulo, int AnoPublicacao, Autor autor){
        this.Titulo = Titulo;
        this.AnoPublicacao = AnoPublicacao;
        this.autor = autor;
    }

    public String getTitulo(){
        return this.Titulo;

    }

    public int getAnoPublicacao(){
        return this.AnoPublicacao;
    }

    public void ImprimirDetalhes(){
        System.out.println("Título do livro: " + Titulo);
        System.out.println("Ano publicação: " + AnoPublicacao);
        System.out.println("Nome autor: " + autor.getNomeAutor());
        System.out.println("Nacionalidade: " + autor.getNacionalidade()+"\n");
    }
}
