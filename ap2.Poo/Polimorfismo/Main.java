package ap2.Polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        List<Encomenda> encomenda = new ArrayList<>();

        while(true){
            String usuario = scanner.nextLine();
            String[] comando = usuario.split(" ");

            if(comando[0].equals("end")){ 
                break;
            }
            if(comando[0].equals("carta")){
                String codigo = comando[1];
                Double peso = Double.parseDouble(comando[2]);
                boolean urgente = Boolean.parseBoolean(comando[3]);

                encomenda.add(new Carta(codigo, peso, urgente));
            }
            if(comando[0].equals("pacote")){
                String codigo = comando[1]; 
                double peso = Double.parseDouble(comando[2]); 
                double largura = Double.parseDouble(comando[3]); 
                double altura = Double.parseDouble(comando[4]); 
                double profundidade = Double.parseDouble(comando[5]); 
            

                encomenda.add(new Pacote(codigo,peso,largura, altura, profundidade));
            }

        }

        System.out.println("\n Processamento das encomendas: " + encomenda.size());

        for(Encomenda item : encomenda){
            System.out.println(encomenda.toString() + "| Valor final: " + item.calcularCustoEnvio());
        }


    }
}
