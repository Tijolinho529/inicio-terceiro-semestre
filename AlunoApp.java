import java.util.Scanner;

public class AlunoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        Aluno aluno = new Aluno(nomeAluno);

        while (true) {
            System.out.print("Digite uma nota (ou 'sair' para finalizar): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                double nota = Double.parseDouble(input);
                aluno.adicionarNota(nota);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número ou 'sair'.");
            }
        }

        System.out.println("\nNome do aluno: " + aluno.getNome());
        System.out.println("Média final: " + aluno.calcularMedia());

        scanner.close();
        }
    }