package ap2.ProcessamentoDeVendas;

public class VendaLocal extends Venda implements Transacionavel{
    private double impostoMunicipal;

    public VendaLocal(double valorBase, String data){
        super(valorBase, data);
        this.impostoMunicipal = 0.05;
    }

    @Override
    public double calcularValorFinal() {
        double resultado = valorBase + (valorBase * impostoMunicipal);
        return resultado;
    } 
}
