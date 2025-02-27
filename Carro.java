public class Carro {

    private String marca;
    private String modelo;
    private String anoFabricacao;

    //CONSTRUTOR
    public Carro(String marca, String modelo, String anoFabricacao){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    //ACESSADOR
    public String getMarca(){
        return marca;
    }

    //MODIFICADOR
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setTamanho (String modelo){
        this.modelo = modelo;
    }

    public String getAnoFabricacao(){
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }
    
}
