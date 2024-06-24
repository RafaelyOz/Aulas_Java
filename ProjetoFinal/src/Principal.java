import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    
// Criação dos arquivos de texto
private static final String ARQUIVO_PRODUTOS = "produto.txt";
private static final String ARQUIVO_PEDIDOS = "pedido.txt";
private static ArrayList<Produto> produtos = new ArrayList<>();
private static ArrayList<Pedido> pedidos = new ArrayList<>();

public static void main(String[] args) {
    carregarProdutos();
    carregarPedidos();

    Scanner scanner = new Scanner(System.in);
    // Menu principal
    while (true) {
        System.out.println("# Menu principal #");
        System.out.println("[1] Produtos");
        System.out.println("[2] Pedidos");
        System.out.println("[3] Sair");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpa a quebra de linha

        switch (opcao) {
            case 1:
                menuProdutos(scanner);
                break;
            case 2:
                menuPedidos(scanner);
                break;
            case 3:
                salvarProdutos();
                salvarPedidos();
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}

// Menu Produtos
private static void menuProdutos(Scanner scanner) {
    while (true) {
        System.out.println("# Produtos #");
        System.out.println("[1] Incluir produto");
        System.out.println("[2] Editar quantidade estoque produto");
        System.out.println("[3] Editar preço unitário produto");
        System.out.println("[4] Excluir produto");
        System.out.println("[5] Listagem produtos");
        System.out.println("[6] Voltar ao menu principal");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpa a quebra de linha

        switch (opcao) {
            case 1:
                incluirProduto(scanner);
                break;
            case 2:
                editarQuantidadeProduto(scanner);
                break;
            case 3:
                editarPrecoProduto(scanner);
                break;
            case 4:
                excluirProduto(scanner);
                break;
            case 5:
                listarProdutos();
                break;
            case 6:
                return;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}

// Menu Pedidos
private static void menuPedidos(Scanner scanner) {
    while (true) {
        System.out.println("# Pedidos #");
        System.out.println("[1] Novo pedido");
        System.out.println("[2] Listagem pedidos");
        System.out.println("[3] Voltar ao menu principal");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpa a quebra de linha

        switch (opcao) {
            case 1:
                novoPedido(scanner);
                break;
            case 2:
                listarPedidos();
                break;
            case 3:
                return;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}

private static void carregarProdutos() {
    try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_PRODUTOS))) {
        String linha;
        while ((linha = reader.readLine()) != null) {
            String[] parts = linha.split(";");
            int codigoProduto = Integer.parseInt(parts[0]);
            String nomeProduto = parts[1];
            double precoUnitario = Double.parseDouble(parts[2]);
            int quantidadeEstoque = Integer.parseInt(parts[3]);
            produtos.add(new Produto(codigoProduto, nomeProduto, precoUnitario, quantidadeEstoque));
        }
    } catch (IOException e) {
        System.out.println("Erro ao carregar produtos: " + e.getMessage());
    }
}

private static void salvarProdutos() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO_PRODUTOS))) {
        for (Produto produto : produtos) {
            writer.write(produto.toString());
            writer.newLine();
        }
    } catch (IOException e) {
        System.out.println("Erro ao salvar produtos: " + e.getMessage());
    }
}

private static void carregarPedidos() {
    try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_PEDIDOS))) {
        String linha;
        while ((linha = reader.readLine()) != null) {
            String[] parts = linha.split(";");
            int numeroPedido = Integer.parseInt(parts[0]);
            int codigoProduto = Integer.parseInt(parts[1]);
            double precoUnitario = Double.parseDouble(parts[2]);
            int quantidade = Integer.parseInt(parts[3]);
            pedidos.add(new Pedido(numeroPedido, codigoProduto, precoUnitario, quantidade));
        }
    } catch (IOException e) {
        System.out.println("Erro ao carregar pedidos: " + e.getMessage());
    }
}

private static void salvarPedidos() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO_PEDIDOS))) {
        for (Pedido pedido : pedidos) {
            writer.write(pedido.toString());
            writer.newLine();
        }
    } catch (IOException e) {
        System.out.println("Erro ao salvar pedidos: " + e.getMessage());
    }
}

private static void incluirProduto(Scanner scanner) {
    System.out.println("Digite o nome do produto: ");
    String nomeProduto = scanner.nextLine();

    System.out.println("Digite o preço unitário do produto: ");
    double precoUnitario = scanner.nextDouble();

    System.out.println("Digite a quantidade em estoque do produto: ");
    int quantidadeEstoque = scanner.nextInt();
    int codigoProduto = produtos.size() + 1;

    produtos.add(new Produto(codigoProduto, nomeProduto, precoUnitario, quantidadeEstoque));
    System.out.println("Produto incluído com sucesso!");
}

private static Produto encontrarProduto(int codigoProduto) {
    for (Produto produto : produtos) {
        if (produto.getCodigoProduto() == codigoProduto) {
            return produto;
        }
    }
    return null;
}

private static void editarQuantidadeProduto(Scanner scanner) {
    System.out.println("Digite o código do produto: ");
    int codigoProduto = scanner.nextInt();

    System.out.println("Digite a nova quantidade em estoque: ");
    int quantidadeEstoque = scanner.nextInt();

    Produto produto = encontrarProduto(codigoProduto);
    if (produto != null) {
        produto.setQuantidadeEstoque(quantidadeEstoque);
        System.out.println("Quantidade em estoque atualizada com sucesso!");
    } else {
        System.out.println("Produto não encontrado!");
    }
}

private static void editarPrecoProduto(Scanner scanner) {
    System.out.println("Digite o código do produto: ");
    int codigoProduto = scanner.nextInt();

    System.out.println("Digite o novo preço unitário: ");
    double precoUnitario = scanner.nextDouble();

    Produto produto = encontrarProduto(codigoProduto);
    if (produto != null) {
        produto.setPrecoUnitario(precoUnitario);
        System.out.println("Preço unitário atualizado com sucesso!");
    } else {
        System.out.println("Produto não encontrado!");
    }
}

private static void excluirProduto(Scanner scanner) {
    System.out.println("Digite o código do produto: ");
    int codigoProduto = scanner.nextInt();
    Produto produto = encontrarProduto(codigoProduto);
    if (produto != null) {
        produtos.remove(produto);
        System.out.println("Produto excluído com sucesso!");
    } else {
        System.out.println("Produto não encontrado!");
    }
}

private static void listarProdutos() {
    System.out.printf("%-10s %-50s %-20s %-20s%n", "Código", "Nome", "Preço unitário", "Quantidade estoque");
    System.out.println("-------------------------------------------------------------------------------------------------");
    double valorTotalEstoque = 0;
    for (Produto produto : produtos) {
        System.out.printf("%-10d %-50s %-20.2f %-20d%n", produto.getCodigoProduto(), produto.getNomeProduto(), produto.getPrecoUnitario(), produto.getQuantidadeEstoque());
        valorTotalEstoque += produto.getPrecoUnitario() * produto.getQuantidadeEstoque();
    }
    System.out.println("-------------------------------------------------------------------------------------------------");
    System.out.printf("Valor total estoque: %.2f%n", valorTotalEstoque);
}

private static void novoPedido(Scanner scanner) {
    System.out.print("Digite o código do produto: ");
    int codigoProduto = scanner.nextInt();
    Produto produto = encontrarProduto(codigoProduto);
    if (produto == null) {
        System.out.println("Produto não encontrado!");
        return;
    }
    System.out.print("Digite a quantidade: ");
    int quantidade = scanner.nextInt();
    if (quantidade > produto.getQuantidadeEstoque()) {
        System.out.println("Quantidade insuficiente no estoque!");
        return;
    }
    int numeroPedido = pedidos.size() + 1;
    pedidos.add(new Pedido(numeroPedido, codigoProduto, produto.getPrecoUnitario(), quantidade));
    produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);
    System.out.println("Pedido realizado com sucesso!");
}

private static void listarPedidos() {
    for (Pedido pedido : pedidos) {
        System.out.printf("Pedido número: %d%n", pedido.getNumeroPedido());
        System.out.printf("%-50s %-20s %-20s %-20s%n", "Produto", "Preço unitário", "Quantidade", "Subtotal");
        System.out.println("--------------------------------------------------------------------------------------");
        Produto produto = encontrarProduto(pedido.getCodigoProduto());
        if (produto != null) {
            double subtotal = pedido.getPrecoUnitario() * pedido.getQuantidade();
            System.out.printf("%-50s %-20.2f %-20d %-20.2f%n", produto.getNomeProduto(), pedido.getPrecoUnitario(), pedido.getQuantidade(), subtotal);
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.printf("Valor total pedido: %.2f%n", subtotal);
        }
    }
}
}

