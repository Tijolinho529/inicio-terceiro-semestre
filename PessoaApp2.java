import java.util.ArrayList;
import java.util.Scanner;

public class PessoaApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao=0;
        while (opcao!=4) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("3. Remover");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao=sc.nextInt();

            switch (opcao) {
                case 1:
                System.out.println("Digite seu nome: ");
                String nome=sc.next();
                System.out.println("Digite seu número de Telefone: ");
                String telefone=sc.next();
                list.add(new Pessoa(nome, telefone));

                    break;

                default:
                    break;
            }

        }

        sc.close();
    }
    
}
