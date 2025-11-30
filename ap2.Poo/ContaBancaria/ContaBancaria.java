package ap2.ContaBancaria;

public class ContaBancaria {

    public Correntista correntista;
    private double saldo;
    public  boolean contaEhEspecial;

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }

    public ContaBancaria(Correntista correntista){
        this.correntista = correntista;
        this.saldo = 0;
        this.contaEhEspecial = false;
    }
    public ContaBancaria(Correntista correntista, double saldo){
        this.correntista = correntista;
        this.saldo = saldo;
        this.contaEhEspecial = false;
    }
    public ContaBancaria(Correntista correntista, double saldo, boolean contaEhEspecial){
        this.correntista = correntista;
        this.saldo = saldo;
        this.contaEhEspecial = contaEhEspecial;
    }

    //método depositar
    public void depositar(double valor){
        this.saldo = valor + saldo;
    }

    //método sacar
    public boolean sacar(double valor){
        if((contaEhEspecial == true) || (contaEhEspecial == false && saldo >= valor)){
            this.saldo = saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    //método para retornar o valor 
    @Override
    public String toString(){
        return "nome: " + correntista.getNome() + "\n" +
               "saldo: " + this.saldo + "\n" +
               "ehEspecial: " + (this.contaEhEspecial ? "sim" : "nao");          
    }
}
