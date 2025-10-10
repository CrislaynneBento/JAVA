import java.util.Scanner;

public class ContaBancaria{

    public static void main(String[] args) {

    String nome = "Cris";
    String tipoConta = "Corrente";
    double saldoInicial = 1599.99;
    int opcao = 0;

    System.out.println("\nNome no cliente: " +nome);
    System.out.println("Tipo conta: " +tipoConta);
    System.out.println("Saldo inicial: " +saldoInicial);

    String menu = """
            
            Digite sua opção:
            1 - Consultar saldo
            2 - Transferir valor
            3 - Receber valor
            4 - Sair
            """;

    Scanner leitura = new Scanner(System.in);

    while(opcao!=4){

        System.out.println(menu);
        opcao = leitura.nextInt();

        if(opcao == 1){

            System.out.println(saldoInicial);

        }

        else if(opcao == 2){

            System.out.println("Qual é o valor que deseja transferir? ");
            double valor = leitura.nextDouble();

            if(valor > saldoInicial){

                System.out.println("\nSaldo insuficiente");

            }

            else {

                saldoInicial = saldoInicial - valor; 

            }
        }

        else if(opcao == 3){

            System.out.println("Valor recebido: ");
            double valor = leitura.nextDouble();
            saldoInicial = saldoInicial + valor;
            System.out.println("\nNovo saldo: " + saldoInicial);

        } 

        else if(opcao != 4){

            System.out.println("Opção inválida");

            }
        }
    }
}