import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("****************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Seu saldo é de: R$ " + saldo);
        System.out.println("\n****************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo 
                2 - Transferir saldo
                3 - Depositar
                4 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        int opcao = 0;

        while (opcao !=4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é de R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir? ");
                double transferencia = leitura.nextDouble();
                if (transferencia > saldo) {
                    System.out.println("Saldo insuficiente.");
                } else {
                    saldo -= transferencia; //saldo = saldo - valor
                    System.out.println("Seu novo saldo é de R$ " + transferencia);
                }
            } else if (opcao == 3) {
                System.out.println("Qual o valor do depósito? ");
                double deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.println("Seu novo saldo é de R$ " + saldo);
            } else if (opcao == 4 ) {
                System.out.println("Programa encerrado.");
            } else
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}
