import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
            System.out.println("Bota um número ae: ");
            double numero1 = sc.nextDouble();
            System.out.println("Bota outro: ");
            double numero2 = sc.nextDouble();
            double soma = numero1 + numero2;
            System.out.println(soma);
            double subtracao = numero1 - numero2;
            System.out.println(subtracao);
            double multiplicacao = numero1 * numero2;
            System.out.println(multiplicacao);
            double divisao = numero1 / numero2;
            System.out.println(divisao);           
    }
}
