package ap2.Lampada;
public class Lampada{
    
    public boolean ligada;
    public int contador;

    public Lampada(){
        this.ligada = false;
        this.contador = 0;
    }

    public void muda(){
        if(ligada){
            this.ligada = false;
        } else {
            this.ligada = true;
            contador++;
        }
    }
    
    @Override
    public String toString(){
        return "Estado: " + ligada + "\n" +
               "Ligada: " + contador;
    }

    public static void main(String[] args) {
        
        Lampada lampada = new Lampada();
        lampada.muda();
        System.out.println(lampada);
        
        lampada.muda();
        System.out.println(lampada);
        
        lampada.muda();
        System.out.println(lampada);
        
    }

}