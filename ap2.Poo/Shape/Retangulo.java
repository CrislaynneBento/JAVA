package ap2.Shape;


public class Retangulo extends Forma{
    protected double largura;
    protected double altura;

    public Retangulo(String nome, double largura, double altura){
        super(nome);
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea(){
        return this.largura * this.altura;
    }

    public double calcularPerimetro(){
        return 2 * (this.altura + this.largura);
    }
}