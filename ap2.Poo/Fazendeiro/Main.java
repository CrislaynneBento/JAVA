package ap2.Colheita;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Fazendeiro fazendeiro = new Fazendeiro(null);

        while(true){
            String usuario = scanner.nextLine();
            String[] comando = usuario.split(" ");
             
            if(comando[0].equals("end")){
                break;
            }
            switch (comando[0]) {
                case "criar":
                    String nome = comando[1];
                    fazendeiro = new Fazendeiro(nome);
                    System.out.println("Criar: " + nome);
                    break;

                case "colher":
                    if(fazendeiro == null){
                        System.out.println("Crie um fazendeiro primeiro: ");
                        break;
                    }

                    String nomeItem = comando[1];
                    int valor = Integer.parseInt(comando[2]);

                    Item item = new Item(nomeItem, valor);
                    boolean ok = fazendeiro.colher(item);
                    System.out.println("Colher: " + nomeItem + ", " + valor + ".");
                    System.out.println(ok ? "colheita ok" : "colheita: inventario cheio.");
                    break;

                case "vender":
                    if(fazendeiro == null){
                        System.out.println("Crie um fazendeiro primeiro: ");
                        break;
                    }
                    String nomeVender = comando[1];
                    boolean vendido = fazendeiro.vender(nomeVender);
                    System.out.println("Vender " + nomeVender);
                    System.out.println(vendido ? "venda ok!" : "venda: item não encontrado");
                    break;
                
                case "show":
                    if(fazendeiro != null){
                        System.out.println("show");
                        System.out.println(fazendeiro);
                    }
                    break;

                default:
                    System.out.println("comando inválido.");
            }
        }
        scanner.close();
    }
}
