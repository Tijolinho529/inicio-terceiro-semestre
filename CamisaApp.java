import java.util.Scanner;

public class CamisaApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Camisa camisa = null;

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Criar Camisa");
            System.out.println("2. Mostrar Camisa");
            System.out.println("3. Modificar Camisa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a cor da Camisa: ");
                    String cor = scanner.nextLine();
                    System.out.print("Digite o tamanho da Camisa: ");
                    String tamanho = scanner.nextLine();
                    System.out.print("Digite o tipo da Camisa: ");
                    String tipo = scanner.nextLine();

                    camisa = new Camisa(cor, tamanho, tipo);
                    System.out.println("Camisa criada!");
                    break;

                case 2: 
                    if (camisa != null) {
                        System.out.println("\nInformações do Produto: ");
                        camisa.mostrarInformacoes();
                    } else {
                        System.out.println("Nenhuma Camisa foi criada");
                    }
                    break;

                case 3:
                    if (camisa != null) {
                        System.out.println("\nO que você quer modificar?");
                        System.out.println("1. Cor");
                        System.out.println("2. Tamanho");
                        System.out.println("3. Tipo");
                        System.out.print("Escolha uma opção: ");
                        int opcaoModificar = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcaoModificar) {
                            case 1:
                                System.out.print("Digite a nova cor: ");
                                camisa.setCor(scanner.nextLine());
                                System.out.println("Cor Modificada!");
                                break;
                            case 2:
                                System.out.print("Digite o novo tamanho: ");
                                camisa.setTamanho(scanner.nextLine());
                                System.out.println("Tamanho Modificado!");
                                break;
                            case 3:
                                System.out.print("Digite o novo tipo: ");
                                camisa.setTipo(scanner.nextLine());
                                System.out.println("Tipo Modificado!");
                                break;
                            default:
                                System.out.println("Opção Inválida");
                        }
                    } else {
                        System.out.println("Nenhuma Camisa foi criada");
                    }
                    break;

                case 4: 
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção Inválida.");
                                  
            }
        }
    }
}
