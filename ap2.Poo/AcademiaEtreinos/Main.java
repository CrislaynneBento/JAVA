package ap2.AcademiaEtreinos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        List<Treino> treinos = new ArrayList<>();

        while(true){

            String usuario = scanner.nextLine();
            String[] comando = usuario.split(" ");

            if(comando[0].equals("end")){
                break;
            }
            if(comando[0].equals("Corrida")){

                int duracaoMinutos1 = Integer.parseInt(comando[1]);
                double distanciaKm1 = Double.parseDouble(comando[2]);

                treinos.add(new Corrida(duracaoMinutos1, distanciaKm1));

            }
            if(comando[0].equals("Musculacao")){

                int duracaoMinutos2 = Integer.parseInt(comando[1]);
                double pesoTotalLevantado2 = Double.parseDouble(comando[2]);
                

                treinos.add(new Musculacao(duracaoMinutos2, pesoTotalLevantado2));
            }
        }

        System.out.println("\n Processamento dos Treinos: " + treinos.size());

        for(Treino treino : treinos){
            System.out.println(treino.toString() + "| Valor Final: " + treino.obterTotalCalorias());
        }
    }
}
