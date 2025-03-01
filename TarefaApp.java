import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TarefaApp {

     public static void main(String[] args) {
        List<Tarefa> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Marcar tarefa como concluída");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    tarefas.add(new Tarefa(descricao));
                    break;
                case 2:
                    System.out.print("Digite o número da tarefa a ser marcada como concluída: ");
                    int numeroTarefa = scanner.nextInt();
                    if (numeroTarefa >= 1 && numeroTarefa <= tarefas.size()) {
                        tarefas.get(numeroTarefa - 1).marcarComoConcluida();
                    } else {
                        System.out.println("Número de tarefa inválido.");
                    }
                    break;
                case 3:
                    System.out.println("\nLista de tarefas:");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}