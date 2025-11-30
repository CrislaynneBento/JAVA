package ap2.Motoca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Moto motoca = new Moto(1);

        while(true){
            String usuario = scanner.nextLine();
            String[] comando = usuario.split(" ");

            if(comando[0].equals("end")){
                break;
            } else if(comando[0].equals("init")){
                int potencia = Integer.parseInt(comando[1]);
                motoca = new Moto(potencia);
            } else if(comando[0].equals("show")){
                System.out.println(motoca.toString());
            } else if(comando[0].equals("enter")){
                String nome = comando[1];
                int idade = Integer.parseInt(comando[2]);

                Pessoa p = new Pessoa(nome, idade);
                motoca.subir(p);
                
            } else if(comando[0].equals("honk")){
                System.out.println(motoca.buzinar());
            } else if(comando[0].equals("buy")){
                int tempo = Integer.parseInt(comando[1]);
                motoca.comprarTempo(tempo);
            } else if(comando[0].equals("drive")){
                int tempo = Integer.parseInt(comando[1]);
                motoca.dirigir(tempo);
            } else if(comando[0].equals("leave")){
                System.out.println(motoca.descer());
            }
        }
        scanner.close();
    }   
}
