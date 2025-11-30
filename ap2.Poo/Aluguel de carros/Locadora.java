package ap2.AluguelDeCarros;

public final class Locadora {

    private static int totalDeCarrosAlugados = 0;
    
    private Locadora(){
    };

    public static void registrarAluguel(){
        totalDeCarrosAlugados++;
    }
    public static void registrarDevolucao(){
        totalDeCarrosAlugados--;
    }

    public static int getTotalAlugados(){
        return totalDeCarrosAlugados;
    }
}
