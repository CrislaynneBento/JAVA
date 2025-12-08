public class Exec{
    public static void main(String [] args){
            
        RoboSimples primeiroRobo = new RoboSimples("Cris", 10, 2, 'S');
        RoboSimples segundoRobo = new RoboSimples("Ana");

        segundoRobo.mudarDirecao('L');
        segundoRobo.mover(1);
        segundoRobo.mover(5);

        RoboSimples terceiroRobo  = new RoboSimples();

        terceiroRobo.mudarDirecao('0');
        terceiroRobo.mover(8);
        terceiroRobo.mudarDirecao('N');
        terceiroRobo.mover();


        System.out.println(primeiroRobo);
        System.out.println(segundoRobo);
        System.out.println(terceiroRobo);

    }
}