package ap2.Polimorfismo;

public class Pacote extends Encomenda implements Rastreavel {
    private double largura;
    private double altura;
    private double profundidade;

    public Pacote(String codigo, double peso, double largura, double altura, double profundidade){
        super(codigo, peso);
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }

    @Override
    public double calcularCustoEnvio() {
        double resultado = peso * 12.0;

        if((largura > 10) || (altura > 10) || (profundidade > 10)){
            resultado = resultado * 1.18;
        }

        return resultado;
    }

    @Override
    public String getStatus() {
        return "Entregue ao destinatario.";
    }
}
