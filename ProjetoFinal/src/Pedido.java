 class Pedido {
    private int numeroPedido;
    private int codigoProduto;
    private double precoUnitario;
    private int quantidade;


    public Pedido(int numeroPedido, int codigoProduto, double precoUnitario, int quantidade){
        this.numeroPedido = numeroPedido;
        this.codigoProduto = codigoProduto;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public int getCodigoProduto(){
        return codigoProduto;
    }

    public int getNumeroPedido(){
        return numeroPedido;
    }

    public double getPrecoUnitario(){
        return precoUnitario;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setCodigoProduto(int codigoProduto){
        this.codigoProduto = codigoProduto;
    }

    public void setNumeroPedido(int numeroPedido){
        this.numeroPedido = numeroPedido;
    }

    public void setPrecoUnitario(double precoUnitario){
        this.precoUnitario = precoUnitario;
    }

    public void setQuantidadeEstoque(int quantidade){
        this.quantidade = quantidade;
    }
}
