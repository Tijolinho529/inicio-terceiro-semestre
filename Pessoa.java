public class Pessoa {

    private String nome;
    private String telefone;

    //CONSTRUTOR
    public Pessoa(String nome, String telefone){
        this.telefone = telefone;
        this.nome = nome;
    }

    //ACESSADOR
    public String getNome(){
        return nome;
    }

    //MODIFICADOR
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}