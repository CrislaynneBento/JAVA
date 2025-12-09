package ap2.AcademiaEtreinos;

public abstract class Treino {

    protected int duracaoMinutos;
    protected int caloriasBase;

    public Treino(int duracaoMinutos){
        this.duracaoMinutos = duracaoMinutos;
        this.caloriasBase = 100;
    }

    public abstract int calcularCaloriasQueimadas();

    public int obterTotalCalorias(){
        int resultado = this.caloriasBase + calcularCaloriasQueimadas();

        return resultado;
    }
}
