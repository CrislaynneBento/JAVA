public class Principal{
    public static void main (String [] args){

        Filme primeiroFilme = new Filme();
        
        primeiroFilme.setNome("Crepúsculo");
        primeiroFilme.setAnoDeLancamento(2012);
        primeiroFilme.setDiretor("Stephanie Mayer");
        primeiroFilme.setDuracaoEmMinutos(120);

        
        primeiroFilme.exibirFicha();
        System.out.println("\n");


        Serie primeiraSerie = new Serie();
        primeiraSerie.setNome("Guerra dos Tronos");
        primeiraSerie.setAnoDeLancamento(2008);
        primeiraSerie.setDiretor("Martin");
        primeiraSerie.setTemporada(07);
        primeiraSerie.setEpisodiosPorTemporada(10);
        primeiraSerie.setMinutosPorEpisodio(60);

        primeiraSerie.exibirFicha();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(primeiroFilme);
        calculadora.inclui(primeiraSerie);
        System.out.println("Calculadora de tempo: "+ calculadora.getTempoTotal());
        System.out.println("\n");


        Episodios episodio = new Episodios();
        episodio.setNumero(1);
        episodio.setSerie(primeiraSerie);
        episodio.setTotalDeVisualizacoes(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(episodio);
    } 
}