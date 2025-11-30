package ap2.AluguelDeCarros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Carro carro = null;

        while(true){
            
            String comando = scanner.next();

            if(comando.equals("end")){
                break;

            }
            if(comando.equals("criar")){
                String placa = scanner.next();

                carro = new Carro(placa);
                System.out.println("Carro criado: " + placa);
                continue;
            }
            if(comando.equals("alugar")){
                if(carro == null){
                    System.out.println("Crie um carro primeiro");
                    break;

                } else { 
                    String nome = scanner.next();
                    String idade = scanner.next();

                    Pessoa p = new Pessoa(nome, 0);
                    boolean ok = carro.alugar(p);

                    continue;
                }
            }
            if(comando.equals("mostrar")){
                System.out.println(carro.toString());
                continue;
            }

            if(comando.equals("devolver")){
                carro.devolver();
                continue;
            }

            if (comando.equals("total_alugados")) {
                System.out.println("Total: " + Locadora.getTotalAlugados());
                continue;
            }
        }
        scanner.close();
    }
}
