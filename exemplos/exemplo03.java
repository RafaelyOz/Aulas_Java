public class exemplo03 {
    public static void main(String[] args) {
        Loja loja = new Loja("OtakuEmporium");

        Secao figurasdeAnime = new Secao("Figuras de Anime");
        figurasdeAnime.adicionarProduto(new Produto("Satoru Gojo", 350.00));

        Secao roupas = new Secao("Moletons");
        roupas.adicionarProduto(new Produto("Moletom Sukuna - Jujutsu Kaisen", 167.90));
        roupas.adicionarProduto(new Produto("Camiseta Kaonashi - Viagem de Chihiro", 45.00));

        Secao poster = new Secao("Poster Animes");
        poster.adicionarProduto(new Produto("Poster Attack on Titan - Segunda Temporada ", 23.50));
        poster.adicionarProduto(new Produto("Poster EVA do Shinji - Neon Genesis Evangelion ", 25.00));


        loja.adicionarSecao(figurasdeAnime);
        loja.adicionarSecao(roupas);
        loja.adicionarSecao(poster);

        loja.ListarProdutos();

    }

    static class Loja {
        private String NomeLoja;
        private Secao[] secaos;
        private int NumSecoes;

        public Loja(String NomeLoja) {
            this.NomeLoja = NomeLoja;
            this.secaos = new Secao[10];
            this.NumSecoes = 0;
        }

        public void adicionarSecao(Secao secao){
            secaos[NumSecoes] = secao;
            NumSecoes++;
        }

        public void ListarProdutos(){
            System.out.println("\n Loja: " + this.NomeLoja);
            for(int i = 0; i < NumSecoes; i++ )
            {
                secaos[i].ListarProdutos();
            }
        }
    }

    static class Produto {
        private String NomeProduto;
        private double Preco;

        public Produto(String NomeProduto, double Preco) {
            this.NomeProduto = NomeProduto;
            this.Preco = Preco;
        }

        public String getNomeProduto(){
            return NomeProduto;
        }

        public double getPreco(){
            return Preco;
        }
    }

    static class Secao {
        private String NomeSecao;
        private Produto[] produtos;
        private int NumProdutos;

        public Secao(String NomeSecao){
            this.NomeSecao = NomeSecao;
            this.produtos = new Produto[10];
            this.NumProdutos = 0;
            
        }

        public void adicionarProduto(Produto produto){
            produtos[NumProdutos] = produto;
            NumProdutos++;
        }

        public void ListarProdutos(){
            System.out.println("\nDepartamento: " + NomeSecao);
            for(int i = 0; i < NumProdutos; i++){
                System.out.println("Produtos: " + produtos[i].getNomeProduto());
                System.out.println("Preco: "+ produtos[i].getPreco());
            }
        }
    }
}
