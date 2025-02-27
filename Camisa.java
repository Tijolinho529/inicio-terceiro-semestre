public class Camisa {

    private String cor;
    private String tamanho;
    private String tipo;

    //CONSTRUTOR
    public Camisa(String cor, String tamanho, String tipo){
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    //ACESSADOR
    public String getCor(){
        return cor;
    }

    //MODIFICADOR
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getTamanho(){
        return tamanho;
    }

    public void setTamanho (String tamanho){
        this.tamanho = tamanho;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void mostrarInformacoes(){
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Tipo: " + tipo);

    }
    
}
