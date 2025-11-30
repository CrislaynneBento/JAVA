package ap2.AluguelDeCarros;

public class Pessoa {

    private String nomeDoCliente;
    private int idadeDoCliente;

    public Pessoa(String nomeDoCliente, int idadeDoCliente){
        this.nomeDoCliente = nomeDoCliente;
        this.idadeDoCliente = idadeDoCliente;
    }
    
    public String getNomeDoCliente(){
        return nomeDoCliente;
    }
    public int getIdadeDoCliente(){
        return idadeDoCliente;
    }

    @Override
    public String toString(){
        return this.nomeDoCliente + ":" + this.idadeDoCliente;
    }
}
