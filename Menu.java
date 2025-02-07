import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao=0;
        while (opcao!=4) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Opção 1");
            System.out.println("2. Opção 2");
            System.out.println("3. Opção 3");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao=sc.nextInt();
        }

        sc.close();
    }
    
}
