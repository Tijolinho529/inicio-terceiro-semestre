import java.util.Scanner;

public class CarroApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = null;

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Criar Carro");
            System.out.println("2. Mostrar Carro");
            System.out.println("3. Modificar Carro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a marca do Carro: ");
                    String marca = scanner.nextLine();
                    System.out.print("Digite o modelo da Carro: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Digite o ano de fabricação do Carro: ");
                    String anoFabricacao = scanner.nextLine();

                    carro = new Carro(marca, modelo, anoFabricacao);
                    System.out.println("Carro criado!");
                    break;

                case 2: 
                    if (carro != null) {
                        System.out.println("\nInformações do Produto: ");
                        carro.mostrarInformacoes();
                    } else {
                        System.out.println("Nenhum Carro foi criado");
                    }
                    break;

                case 3:
                    if (carro != null) {
                        System.out.println("\nO que você quer modificar?");
                        System.out.println("1. Marca");
                        System.out.println("2. Modelo");
                        System.out.println("3. Ano de Fabricação");
                        System.out.print("Escolha uma opção: ");
                        int opcaoModificar = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcaoModificar) {
                            case 1:
                                System.out.print("Digite a nova marca: ");
                                carro.setMarca(scanner.nextLine());
                                System.out.println("Marca Modificada!");
                                break;
                            case 2:
                                System.out.print("Digite o novo modelo: ");
                                carro.setModelo(scanner.nextLine());
                                System.out.println("Modelo Modificado!");
                                break;
                            case 3:
                                System.out.print("Digite o novo ano de fabricação: ");
                                anoFabricacao.setAnoFabricacao(scanner.nextLine());
                                System.out.println("Ano de Fabricação Modificado!");
                                break;
                            default:
                                System.out.println("Opção Inválida");
                        }
                    } else {
                        System.out.println("Nenhum Carro foi criado");
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
