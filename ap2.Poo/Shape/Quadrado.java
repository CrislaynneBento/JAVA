package ap2.Shape;


public class Quadrado extends Forma{
    protected double lado;

    public Quadrado(String nome, double lado){
        super(nome);
        this.lado = lado;
    }
    public double calcularArea(){
        return this.lado * this.lado;
    }

    public double calcularPerimetro(){
        return  4*lado;
    }
}