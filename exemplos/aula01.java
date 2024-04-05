public class Main {
    public static void main(String[] args) {
        /* Criando um cliente */
        Cliente cliente1 = new Cliente("Joao", "joao@exemplo.com", "Rua A, 123");

        Cliente cliente2 = new Cliente ("Rafaely", "rafaely@exemplo.com", "Rua Francisco, 678");

        Cliente cliente3 = new Cliente("Ana", "ana@hotmail.com", "Rua das Carmelias, 112");

        Cliente cliente4 = new Cliente("Giovani", "Gio@gmail.com", "Rua Dos Solares, 67");

        /* Criando um pedido associado ao cliente */
        Pedido pedido1 = new Pedido(1, 150, cliente1);

        Pedido pedido2 = new Pedido(2, 340, cliente2);

        Pedido pedido3 = new Pedido(3, 67, cliente3);

        Pedido pedido4 = new Pedido(4, 678, cliente3);

        Pedido pedido5 = new Pedido(5, 20, cliente1);

        Pedido pedido6 = new Pedido(6, 89, cliente4);


 
        /* Imprimindo os detalhes do pedido */
        pedido1.imprimirDetalhes();
        pedido2.imprimirDetalhes();
        pedido3.imprimirDetalhes();
        pedido4.imprimirDetalhes();
        pedido5.imprimirDetalhes();
        pedido6.imprimirDetalhes();
    }
}
 
class Cliente {
    public String nome;
    public String email;
    public String endereco;
 
    /* Construtor da classe */
    public Cliente(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }
 
    /* Outros metodos: getters e setters */
    public String getNome(){
        return this.nome;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
}
 
class Pedido {
    public int numero;
    public double valorTotal;
    public Cliente cliente; /* Relacionamento de associacao com Cliente */
 
    /* Construtor da classe */
    public Pedido(int numero, double valorTotal, Cliente cliente) {
        this.numero = numero;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }
 
    /* Metodo para imprimir os detalhes do pedido */
    public void imprimirDetalhes() {
        System.out.println("Numero do pedido: " + numero);
        System.out.println("Valor do pedido: " + valorTotal);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Email do cliente: " + cliente.getEmail());
        System.out.println("Endereco de entrega: " + cliente.getEndereco() + "\n");
    }
}