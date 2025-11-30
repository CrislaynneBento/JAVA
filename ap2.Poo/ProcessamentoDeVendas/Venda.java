package ap2.ProcessamentoDeVendas;

public abstract class Venda implements Transacionavel {
    protected  double valorBase;
    protected  String data;

    public Venda(double valorBase, String data){
        this.valorBase = valorBase;
        this.data = data;
    }

    public abstract double calcularValorFinal();

    @Override
    public String toString(){
        return "Data: " + this.data + ", Valor Base: " + this.valorBase; 
    }
    
}
