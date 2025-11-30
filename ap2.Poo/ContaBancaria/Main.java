package ap2.ContaBancaria;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // autorizando aentrada de dados do teclado
        Scanner scanner = new Scanner(System.in);
    
        //chamando a classe conta Bancaria que possui os dados do correntista no construtor;
        ContaBancaria conta = new ContaBancaria(null, 0, false);

        while (true) { 
            String comando = scanner.nextLine();
            //slipt é um comando para quebrar a linha quando ouver espaço
            String[] usuario = comando.split(" ");

            if(usuario[0].equals("end")){
                break;
            }
            else if(usuario[0].equals("criar")){
                String nome = scanner.nextLine();
                String cpf = scanner.nextLine();

                double valorInicial = Double.parseDouble(scanner.nextLine());
                String status = scanner.nextLine();

                boolean ehEspecial = (status.equals("S") ? true : false); 
                
                Correntista titular = new Correntista(nome, cpf);
                conta = new ContaBancaria(titular, valorInicial, ehEspecial);
                
            }
            else if(usuario[0].equals("mostrar")){
                System.out.println(conta.toString());
            } 
            else if(usuario[0].equals("depositar")){ 
                double depositar = Double.parseDouble(scanner.nextLine());
                conta.depositar(depositar);
            }
            else if(usuario[0].equals("sacar")){
                double sacar = Double.parseDouble(scanner.nextLine());
                conta.sacar(sacar);
            }
        }     
        
        scanner.close();
    }   
}
