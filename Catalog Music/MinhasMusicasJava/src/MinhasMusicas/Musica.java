package MinhasMusicas;

public class Musica extends Audio{
	
	private String album;
	private String artista;
	private String genero;
	
    public Musica(String titulo, double duracao, String album, String artista, String genero){
        super(titulo, duracao);
        this.album = album;
        this.artista = artista;
        this.genero = genero;
    }
    
    public void setAlbum(String album) {
    	this.album = album;
    }
    public void setArtista(String artista) {
    	this.artista = artista;
    }
    public void setGenero(String genero) {
    	this.genero = genero;
    }
    public String getAlbum() {
    	return album;
    }
    public String getArtista() {
    	return artista;
    }
    public String getGenero() {
    	return genero;
    }
    
    @Override
    public int getClassificacao(){
    	if(this.getTotalDeReproducoes() > 30) {
    		return 10;
    	} else { 
    		return 8;
    	}
    }
}
