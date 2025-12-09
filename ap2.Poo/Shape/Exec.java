package ap2.Shape;

public class Exec{
    public static void main(String [] args){
        System.out.println("------------------Inicial--------------------");

        //instâncias
        Circulo c = new Circulo("Circulo", 2);
        Quadrado q = new Quadrado("Quadrado", 4);
        Retangulo r = new Retangulo("Retangulo", 30, 20);

        System.out.println(c);
        System.out.println(q);
        System.out.println(r);
    }
}