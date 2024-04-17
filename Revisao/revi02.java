public class revi02 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto 1", 10.0, 5);
        Produto produto2 = new Produto("Produto 2", 20.0, 3);
        Produto produto3 = new Produto("Produto 3", 30.0, 2);

      
        Estoque estoque = new Estoque();

        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        estoque.adicionarProduto(produto3);

        
        double valorTotalEmEstoque = estoque.CalcularValorTotal();

        
        System.out.println("Valor total em estoque: R$" + valorTotalEmEstoque);
    }
}

class Produto {

    private String NomeProduto;
    private double PrecoUnitario;
    private int Quantidade;

    public Produto(String NomeProduto, double PrecoUnitario, int Quantidade) {

        this.NomeProduto = NomeProduto;
        this.PrecoUnitario = PrecoUnitario;
        this.Quantidade = Quantidade;

    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public double getPrecoUnitario() {
        return PrecoUnitario;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void adicionarAoEstoque(int quantidade) {
        this.Quantidade += quantidade;
    }

    public void removeDoEstoque(int quantidade) {
        if (this.Quantidade >= quantidade) {
            this.Quantidade -= quantidade;
        } else {
            System.out.println("Quantidade a ser removida do estoque é maior do que a quantidade disponivel.");
        }
    }

}

class Estoque {
    private Produto[] produtos;
    private int numProdutos;
    
    public Estoque() {
        this.produtos = new Produto[80];
        this.numProdutos = 0;
    }

    public void adicionarProduto(Produto produto) {
        if (numProdutos < 80) {
            produtos[numProdutos++] = produto;
            System.out.println("Nome do Produto: " + produto.getNomeProduto());
        } else {
            System.out.println("Numero de produtos excedido!");
        }
    }

    private Produto buscarProdutoPorNome(String NomeProduto) {
        for (Produto produto : produtos) {
            if (produto != null && produto.getNomeProduto().equalsIgnoreCase(NomeProduto)) {
                return produto;
            }
        }
        return null;
    }

    public void atualizarEstoque(String nomeProduto, int quantidade) {
        Produto produto = buscarProdutoPorNome(nomeProduto);

        if (produto != null) {
            if (quantidade >= 0) {
                produto.adicionarAoEstoque(quantidade);
                System.out.println("Estoque do produto '"+ nomeProduto + "' atualizado com sucesso");
            } else {
                produto.removeDoEstoque(quantidade);
                System.out.println("Estoque do produto: '"+ nomeProduto + "' atualizado com sucesso");
            }
        } else {
            System.out.println("Produto '"+ nomeProduto + "' não encontrado no estoque");
        }
    }

    public void ExibirProdutos() {
        for (int i = 0; i < numProdutos; i++) {
            Produto produto = produtos[i];
            System.out.println("Nome: " + produto.getNomeProduto() + " Preço Unitario: " + produto.getPrecoUnitario() + " Quantidade: " + produto.getQuantidade());
        }
    }

    public double CalcularValorTotal() {
        double valorTotal = 0.0;
        for (Produto produto : produtos) {
            if (produto != null) {
                valorTotal += produto.getPrecoUnitario() * produto.getQuantidade();
            }
        }
        return valorTotal;
    }
}
