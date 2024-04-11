public class exemplo03 {
    public static void main(String[] args) {

    }

    class Loja {
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
            for(int i = 0; i < NumProdutos; i++ )
        }
    }

    class Produto {
        private String NomeProduto;
        private double Preco;

        public Produto(String NomeProduto, double Preco) {
            this.NomeProduto = NomeProduto;
            this.Preco = Preco;
        }

        public String getNomeProduto(){
            return NomeProduto;
        }

        public String getPreco(){
            return Preco;
        }
    }

    class Secao {
        private String NomeSecao;
        private Produto[] produtos;
        private int NumProdutos;

        public Secao(String NomeSecao, int NumProdutos){
            this.NomeSecao = NomeSecao;
            this.produtos = new Produto[];
            this.NumProdutos = 0;
            
        }

        public void adicionarProduto(Produto produto){
            produtos[NumProdutos] = produto;
            NumProdutos++;
        }
    }
}
