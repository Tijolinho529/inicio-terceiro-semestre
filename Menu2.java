import java.util.Scanner;

public class Menu2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        while (op!=5) {
            System.out.println("\n===MENU===");
            System.out.println("1-CADASTRAR");
            System.out.println("2-ALTERAR");
            System.out.println("3-LISTAR");
            System.out.println("4-REMOVER");
            System.out.println("5-REMOVER");
            System.out.println("Escolha a opção");
            op=sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("kiko nawara");
                    break;
                case 2:
                    System.out.println("sujiro kimimame");
                    break;
                default:
                System.out.println("você digitou a opção errada");
                    break;
            }
        }
        sc.close();
    }


    
}
