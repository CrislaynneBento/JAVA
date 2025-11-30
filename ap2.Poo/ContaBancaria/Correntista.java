package ap2.ContaBancaria;

public class Correntista {
    //atributos privados
    private String nome;
    private String cpf;

    //construtor;
    public Correntista(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //sets para atribuir
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    //gets para retornar
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }


    
}