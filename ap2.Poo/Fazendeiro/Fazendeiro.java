package ap2.Colheita;

public class Fazendeiro {
    private String nome;
    private int dinheiro;
    public Item item1;
    public Item item2;
    public Item item3;

    public String getNome(){
        return nome;
    }
    public int getDinheiro(){
        return dinheiro;
    }

    public void setDinheiro(int dinheiro){
        this.dinheiro = dinheiro;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Fazendeiro(String nome){
        this.nome = nome;
        this.dinheiro = 100;
        this.item1 = null;
        this.item2 = null;
        this.item3 = null;
    }

    public boolean colher(Item item){
        if(item1 == null){
            this.item1 = item;
            return true;
        } else if (item2 == null){
            this.item2 = item;
            return true;
        } else if (item3 == null){
            this.item3 = item;
            return true;
        } else {
            return false;
        }
    }

    public boolean vender(String nomeItem){
        if(this.item1 != null && item1.getNome().equals(nomeItem)){
            this.dinheiro = dinheiro + item1.getValorVenda();
            this.item1 = null;
            return true;
        } else if(this.item2 != null && item2.getNome().equals(nomeItem)){
            this.dinheiro = dinheiro + item2.getValorVenda();
            this.item2 = null;
            return true;
        } else if(this.item3 != null && item3.getNome().equals(nomeItem)){
            this.dinheiro = dinheiro + item3.getValorVenda();
            this.item3 = null;
            return true;
        } else {
            return false;
        }
    }
    
    public String toString(){

        String s1 = (this.item1 == null) ? "empty" : item1.toString();
        String s2 = (this.item2 == null) ? "empty" : item2.toString();
        String s3 = (this.item3 == null) ? "empty" : item3.toString();

        return "Nome: " + this.nome + "\n" +
               "Dinheiro: " + this.dinheiro + "\n" +
               "Inventario: " + s1 + ", " + s2 + ", " + s3;
    }
}
