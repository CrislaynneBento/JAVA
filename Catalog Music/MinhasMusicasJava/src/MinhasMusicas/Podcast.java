package MinhasMusicas;

public class Podcast extends Audio{
	
	private String host;
	private String descricao;
	
	public Podcast(String titulo, double duracao, String host, String descricao){
        super(titulo, duracao);
        this.host = host;
        this.descricao = descricao;
    }
	
	public void setHost(String host) {
    	this.host = host;
    }
    public void setDescricao(String descricao) {
    	this.descricao = descricao;
    }

    
    
    public String getHost() {
    	return host;
    }
    public String getDescricao() {
    	return descricao;
    }
    
    @Override
    public int getClassificacao() {
    	if(this.getCurtidas() > 30) {
    		return 10;
    	} else {
    		return 8;
    	}
    }
}
