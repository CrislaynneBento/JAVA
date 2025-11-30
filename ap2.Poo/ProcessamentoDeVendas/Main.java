package ap2.ProcessamentoDeVendas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Venda> transacoes = new ArrayList<>();
        System.out.println("Sistema iniciado. Digite o comando: ");

        while (true) { 
            String comando = scanner.nextLine();
            String[] usuario = comando.split(" ");

            if(usuario[0].equals("end")){
                break;
            }
            if(usuario[0].equals("VendaLocal")){

                Double valor1 = Double.parseDouble(usuario[1]);
                String data1 = usuario[2];

                transacoes.add(new VendaLocal(valor1, data1));

            }
            if(usuario[0].equals("VendaInternacional")){

                Double valor2 = Double.parseDouble(usuario[1]);
                String data2 = usuario[2];

                transacoes.add(new VendaInternacional(valor2, data2));
            }
        }

        System.out.println("\n Processamento Final de Transações (" + transacoes.size() + " vendas)");

        for(Venda venda : transacoes){
            System.out.println(venda.toString() + "| Valor Final: " + venda.calcularValorFinal());
        }
    }
}
