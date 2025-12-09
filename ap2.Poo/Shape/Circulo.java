package ap2.Shape;


public class Circulo extends Forma{
    protected double raio;
    protected double pi = 3.14;

    public Circulo(String nome, double raio){
        super(nome);
        this.raio = raio;
    }

    public double getArea(){
        return this.pi * this.raio * this.raio;
    }

    public double getPerimetro(){
        return 2 * this.pi * this.raio;
    }

    
}
