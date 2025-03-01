import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        System.out.print("Quantos produtos deseja cadastrar? ");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println("\nCadastro do Produto " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Preço: R$");
            double preco = scanner.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); 

            Produto produto = new Produto(nome, preco, quantidade);
            produtos.add(produto);
        }

        System.out.println("\nLista de Produtos Cadastrados:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        scanner.close();
        }
    } 