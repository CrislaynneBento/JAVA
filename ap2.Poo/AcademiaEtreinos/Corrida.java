package ap2.AcademiaEtreinos;

public class Corrida extends Treino {
    private double distanciaKm;

    public Corrida(int duracaoMinutos, double distanciaKm){
        super(duracaoMinutos);
        this.distanciaKm = distanciaKm;
    }

    @Override
    public int calcularCaloriasQueimadas() {
        int resultado = (int) (distanciaKm * 50);
        return resultado;
    }
}
