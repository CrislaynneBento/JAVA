public class Serie extends Titulo{
    private int temporada;
    private int episodios;
    private int episodiosPorTemporada;
    private double minutosPorEpisodio;

    public int getTemporada(){
        return temporada;
    }
    public int getEpisodios(){
        return episodios;
    }
    public int getEpisodiosPorTemporada(){
        return episodiosPorTemporada;
    }
    public double getMinutosPorEpisodio(){
        return minutosPorEpisodio;
    }

    public void setTemporada(int temporada){
        this.temporada = temporada;
    }
    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public void setMinutosPorEpisodio(double minutosPorEpisodio){
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
    @Override
    public int getDuracaoEmMinutos(){
        return (int)(temporada * episodiosPorTemporada * minutosPorEpisodio);
    }

    @Override
    public void exibirFicha() {
        super.exibirFicha();  // chama a ficha básica de Titulo
        System.out.println("Temporadas: " + temporada);
        System.out.println("Episódios por temporada: " + episodiosPorTemporada);
        System.out.println("Minutos por episódio: " + minutosPorEpisodio);
        System.out.println("Duração total: " + getDuracaoEmMinutos() + " minutos");
        System.out.println("\n");
    }   
}