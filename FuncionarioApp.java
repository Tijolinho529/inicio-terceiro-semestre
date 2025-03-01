import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FuncionarioApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome do funcionário (ou 'fim' para encerrar):");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Digite o cargo do funcionário:");
            String cargo = scanner.nextLine();

            System.out.println("Digite o salário do funcionário:");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            Funcionario funcionario = new Funcionario(nome, cargo, salario);
            funcionarios.add(funcionario);
        }

        System.out.println("\nLista de funcionários cadastrados:");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Cargo: " + funcionario.getCargo());
            System.out.println("Salário: " + formatoMoeda.format(funcionario.getSalario()));
            System.out.println("--------------------");
        }

        scanner.close();
    }
}
