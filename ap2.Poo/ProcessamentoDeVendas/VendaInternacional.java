package ap2.ProcessamentoDeVendas;

public class VendaInternacional extends Venda implements Transacionavel {
    private double taxaDeConversao;

    public VendaInternacional(double valorBase, String data){
        super(valorBase, data);
        this.taxaDeConversao = 0.25;
    }

    @Override
    public double calcularValorFinal() {
        double resultado = valorBase * taxaDeConversao;
        return resultado;
    }
}
