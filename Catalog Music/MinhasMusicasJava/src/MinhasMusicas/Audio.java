package MinhasMusicas;

public class Audio {

	private String titulo;
	private double duracao;
	private int totalDeReproducoes;
	private int curtidas;
	private int classificacao;
	
	public Audio(String titulo, double duracao) {
		this.titulo = titulo;
		this.duracao = duracao;
	}
	
	
	public String getTitulo(){
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	public double getDuracao(){
		return duracao;
	}
	
	
	public int getTotalDeReproducoes(){
		return totalDeReproducoes;
	}
	
	
	public int getCurtidas(){
        return curtidas;
    }

    
	public int getClassificacao(){
        return classificacao;
    }
	
	public void curtir(){
		this.curtidas++;
	}
	public void reproduz(){
		this.totalDeReproducoes++;
	}
}
