package ap2.Toalha;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);
        
    Toalha criarToalha = new Toalha("", "");

    while (true) { 
        String comando = entrada.next();
        System.out.println("$" + comando);

        if(comando.equals("end")){
            break;
        } else if(comando.equals("criar")){
            String cor = entrada.next();
            System.out.println("$" + cor);

            String tamanho = entrada.next();
            System.out.println("$" + tamanho);
        }

        else if(comando.equals("mostrar")){
            criarToalha.mostrar();
        }
        else if(comando.equals("enxugar")){
            int quantidade = entrada.nextInt();
            System.out.println("$" + quantidade);
            criarToalha.enxugar(quantidade);
        }

        else if(comando.equals("torcer")){
            criarToalha.torcer();

        }

        else if(comando.equals("getMaxUmidade")){
            System.out.println(criarToalha.getMaxUmidade());
        }

        else if(comando.equals("estaSeca")){
            System.out.println(criarToalha.estaSeca());
            }
        }
        entrada.close();
    }

}
