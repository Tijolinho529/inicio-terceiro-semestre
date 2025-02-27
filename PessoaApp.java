public class PessoaApp {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Davi", "22222222");

        System.out.println("O nome: "+p1.getNome()+ " Telefone"+ p1.getTelefone());

        p1.setNome("Leal");
        System.out.println("O novo nome é: "+p1.getNome()+ " Telefone"+ p1.getTelefone());

        Pessoa p2 = new Pessoa("Melodie", "333333333");

        System.out.println("O nome: "+p2.getNome()+ " Telefone"+ p2.getTelefone());
    }
    
}
