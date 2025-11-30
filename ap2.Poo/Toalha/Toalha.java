package ap2.Toalha;
public class Toalha {
    private String cor;
    private String tamanho;
    private int umidade;

    
    //construtor para criar uma toalha nova;
    public Toalha(String cor, String tamanho){
        this.cor = cor;
        this.tamanho = tamanho;
        this.umidade = 0;
    }


    //método para retornar o máximo de umidade baseado no tamanho
    public int getMaxUmidade(){
        if(this.tamanho.equals("G")){
            return 30;
        } else if (this.tamanho.equals("M")){
            return 20;
        } else if (this.tamanho.equals("P")){
            return 10;
        } else{
            return 0;
        }
    }

    
    //método para enxugar
    public void enxugar(int quantidade){
        int max = this.getMaxUmidade();
        
        if(this.umidade + quantidade >= max){
            this.umidade = max;
        } else {
            this.umidade = quantidade + umidade;
        }
    }
    

    //método para torcer
    public void torcer(){
        this.umidade = 0;
    }


    //método para dizer se a toalha está seca ou não
    public boolean estaSeca(){
        if(this.umidade == 0){
            return true;
        } else {
            return false;
        }
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getTamanho(){
        return tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public int getUmidade(){
        return umidade;
    }
    public void setUmidade(int umidade){
        this.umidade = umidade;
    }

    
    //método para mostrar
    public void mostrar(){
        System.out.println(this.cor + " " + this.tamanho + " " + this.umidade);
    }
}