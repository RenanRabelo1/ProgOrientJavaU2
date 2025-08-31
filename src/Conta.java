import java.sql.SQLOutput;
import java.util.Scanner;

public class Conta {

    String cpf;
    String numeroBanco;
    double saldo;
    String cliente_especial;
    double total;

    public void bonificacao(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Número do CPF:");
        cpf = sc.next();
        System.out.println("Número do Banco:");
        numeroBanco = sc.next();
        System.out.println("Valor do saldo:");
        saldo = sc.nextDouble();
        System.out.println("O cliente é especial?");
        cliente_especial = sc.next();

        if(cliente_especial.equalsIgnoreCase("Sim")) {
            double a_mais = saldo * 0.1;
            total = saldo + a_mais;
        }
        else{
            double a_mais = saldo * 0.05;
            total = saldo + a_mais;
        }


        System.out.printf("CPF: %s%nNúmero do Banco: %s%nValor com Bonificação: %.2f%n", cpf, numeroBanco, total);

    }
}
