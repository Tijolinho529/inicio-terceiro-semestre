
import java.util.Scanner;


public class Atividade2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Bota um número ae: ");
            double numero1 = sc.nextDouble();
            System.out.println("Bota outro: ");
            double numero2 = sc.nextDouble();
            double media = (numero1 + numero2) / 2;
            System.out.println(media);
    }

}
