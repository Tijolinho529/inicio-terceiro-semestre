package Cliente;
import java.util.Scanner;

public class ClienteApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o email do cliente: ");
        String email = scanner.nextLine();

        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();

        Cliente cliente = new Cliente(nome, email, telefone);

        System.out.println("Informações do cliente:");
        System.out.println(cliente.toString());

        scanner.close();
    }
}
    
