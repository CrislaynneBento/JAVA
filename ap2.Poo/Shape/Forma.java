package ap2.Shape;


public class Forma{
    protected  String nome;
    protected  double area;
    protected  double perimetro;

    public Forma(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + ", Area: " + this.area + "Perimetro: " + this.perimetro;
    }


}