package MinhasMusicas;

public class MinhasPreferidas {

	public MinhasPreferidas() {
	}
	
	public void Pasta(Audio audio) {
		if(audio.getClassificacao() == 10) {
			System.out.println(audio.getTitulo() + " é sucesso absoluto.");
		} else {
			System.out.println(audio.getTitulo() + " também está sendo bem avaliado.");
		}
	}

}
