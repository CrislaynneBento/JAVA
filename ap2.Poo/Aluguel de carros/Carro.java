package ap2.AluguelDeCarros;

public class Carro {

    private String placa;
    private boolean disponibilidade;
    private Pessoa locatario;

    public Carro(String placa){
        this.placa = placa;
        this.disponibilidade = true;
        this.locatario = null;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getPlaca(){
        return placa;
    }

    public boolean getDisponibilidade(){
        return disponibilidade;
    }
    public Pessoa getLocatario(){
        return locatario;
    }

    public boolean alugar(Pessoa locatario){
        if((locatario.getIdadeDoCliente() < 18) || (!disponibilidade)){
            System.out.println("Você não pode alugar esse carro");
            return false;
        } else {
            this.disponibilidade  = false;
            this.locatario = locatario;
            System.out.println("Parabéns, você alugou o carro!");
            return true;
        }
    }

    public boolean devolver(){
        if(disponibilidade){
            System.out.println("Este carro está disponível.\n");
            return false;
        }else {
            this.disponibilidade = true;
            this.locatario = null;
            System.out.println("Carro devolvido");
            return true;
        }
    }

    @Override
    public String toString(){
        String disp = disponibilidade ? "sim" : "nao";
        String loc = (locatario == null) ? "empty" : locatario.toString();
        return "Placa: " + placa + ", Disponivel: " + disp + ", Locatario: (" + loc + ")";
    }
    
}
