package ap2.Polimorfismo;

public abstract class Encomenda implements Rastreavel{
    protected String codigo;
    protected double peso;

    public Encomenda(String codigo, double peso){
        this.codigo = codigo;
        this.peso = peso;
    }

    public abstract double calcularCustoEnvio();

    @Override
    public String toString(){
        return "Código: " +this.codigo + ", peso: " + this.peso;
    }    


}
