package ap2.Colheita;

public class Item {
    
    private String nome;
    private int valorVenda;

    public Item(String nome, int valorVenda){
        this.nome = nome;
        this.valorVenda = valorVenda;
    }

    public String getNome(){
        return nome;
    }
    
    public int getValorVenda(){
        return valorVenda;
    }
    @Override
    public String toString(){

        return  this.nome + ":" + this.valorVenda;
    }
}
