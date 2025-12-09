package ap2.AcademiaEtreinos;

public class Musculacao extends Treino {
    private double pesoTotalLevantado;

    public Musculacao(int duracaoMinutos, double pesoTotalLevantado){
        super(duracaoMinutos);
        this.pesoTotalLevantado = pesoTotalLevantado;
    }

    @Override
    public int calcularCaloriasQueimadas() {
        int resultado = (int) (pesoTotalLevantado/10);
        return resultado;
    }
}
