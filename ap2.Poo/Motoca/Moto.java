package ap2.Motoca;

public class Moto {

    public Pessoa pessoa;
    private int potencia;
    private int tempo;

    public Moto(int potencia){
        this.potencia = potencia;
        this.tempo = 0;
        this.pessoa = null;
        
    }

    public boolean subir(Pessoa subir){
        if(this.pessoa == null){
            this.pessoa = subir;
            return true;
        } else {
            System.out.println("fail: busy motorcycle");
            return false;
        }
    }


    public Pessoa descer(){
        if(this.pessoa == null){
            System.out.println("fail: empty motorcycle");
            return null;
        } 
        Pessoa quemSaiu = this.pessoa;
        this.pessoa = null;
        return quemSaiu;
    }


    public String buzinar(){
        String som = "P";

            for(int i = 0; i < potencia; i++){
                som = som + "e";
            }
        return som + "m";
    }

    public void comprarTempo(int tmp){
        this.tempo = tempo + tmp;
    }

    public void dirigir(int tmp){
        if(this.pessoa == null){
            System.out.println("fail: empty motorcycle");
            return;
        }
        if(this.pessoa.getIdade() > 10){
            System.out.println("fail: to old to drive");
            return;
        }
        if(this.tempo <= 0){
            System.out.println("fail: buy time first");
            return;
        }
        
        if(this.tempo >= tmp){
            this.tempo = tempo - tmp;
        }
        else { 
            System.out.println("fail: time finished after " + this.tempo + " minutes");
            this.tempo = 0;
        }
    }
    @Override
    public String toString(){
        String quem = (this.pessoa == null) ? "empty" : this.pessoa.toString();

        return "power:" + this.potencia + ", time:" + this.tempo + ", person:(" + quem + ")";
    }
}
