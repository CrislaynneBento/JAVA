package Principal;

import MinhasMusicas.MinhasPreferidas;
import MinhasMusicas.Musica;
import MinhasMusicas.Podcast;

public class Principal {

	public Principal() {
	}

	public static void main(String[] args) {
		
		Musica PrimeiraMusica = new Musica("Retratos e Canções", 3.54, "Sandrá Sá", "Sandrá de Sá", "MPB");
		Podcast PrimeiroPod = new Podcast("A exploração no Brasil", 15.00, "Silvio Santos", "Uma breve explicação sobre a chegada dos portugueses nas americas");
		
		for(int i = 0; i < 50; i++) {
			PrimeiraMusica.reproduz();
		}
		for(int i = 0; i < 50; i++) {
			PrimeiraMusica.curtir();
		}
		
		for(int i = 0; i < 50; i++) {
			PrimeiroPod.reproduz();
		}
		for(int i = 0; i < 20; i++) {
			PrimeiroPod.curtir();
		}
		
		MinhasPreferidas musicas = new MinhasPreferidas();
		musicas.Pasta(PrimeiroPod);
		
	}
	
	
}
