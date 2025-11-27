public class Filme extends Titulo implements Classificavel{
    
    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2; 
    }
    
}