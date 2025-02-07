import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Namoral, bota tua senha ae: ");
        String senha=sc.next();

        if(senha.equals("alfa")){
            System.out.println("Acertou miseravi");
        }else{
            System.out.println("GET OUT");
        }
        sc.close();
    }
    
}
