import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op=0;

        do {

            
            while (op!=5) {
            System.out.println("1 - Caixa de Papelão");
            System.out.println("2 - Sacola Plástica");
            System.out.println("3 - Embalagem de Vidro");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma Caixa: ");
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Caixa de Papelão: Ideal para transporte e armazenamento.");
                break;
                case 2:
                    System.out.println("Sacola Plástica: Leve e prática, mas pouco sustetável.");
                break;
                case 3:
                    System.out.println("Embalagem de Vidro: Resistente e reutiliável.");
                break;
                case 4:
                    System.out.println("Encerrando...");
                break;
                default:
                    System.out.println("Opção Inválida.");
            }
                
        }  while (op!=0);

        sc.close();
    }
}