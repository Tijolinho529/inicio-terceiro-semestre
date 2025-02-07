import java.util.Scanner;

public class Professor {

    public static void main(String[] args) {
        
        String professor="";
        Scanner sc = new Scanner(System.in);
        while (!professor.equals("Anderson") ){
            System.out.println("Qual o professor mais fofo do Senai?");
            professor=sc.next();
        }

        sc.close();
    }
    
}
