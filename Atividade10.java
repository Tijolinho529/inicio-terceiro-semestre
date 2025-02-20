import java.util.Scanner;

public class Atividade10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de nomes que deseja cadastrar: ");
        int quantidadeDeNomes = scanner.nextInt();
        scanner.nextLine();

        String[] nomes = new String[quantidadeDeNomes];
        
        System.out.println("Digite os nomes");
        for (int i = 0; i < quantidadeDeNomes; i++) {
            System.out.println("Nome "+ (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        System.out.println("");
    }
    
}
