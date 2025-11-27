public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private String diretor;

    public String getDiretor(){
        return diretor;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }

    public String getNome(){
        return nome;
    }
    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }
    public boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }
    public double getSomaDasAvaliacoes(){
        return somaDasAvaliacoes;
    }
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void setTotalDeAvaliacoes(int totalDeAvaliacoes){
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos; 
    }
    
    public void exibirFicha(){
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Duração do filme: " +getDuracaoEmMinutos() + " minutos");
        System.out.println("Nome do Diretor: " + getDiretor());
    }

    public void avalia(double nota){
        somaDasAvaliacoes = nota + somaDasAvaliacoes;
        totalDeAvaliacoes++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }


}

