import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {

        int code, code2;
        double valor_unitario, valor_unitario2;
        int numero_de_pecas, numero_de_pecas2;
        double valorAPagar;
        Scanner sc = new Scanner(System.in);

        code = sc.nextInt();
        valor_unitario = sc.nextDouble();
        numero_de_pecas = sc.nextInt();
        code2 = sc.nextInt();
        valor_unitario2 = sc.nextDouble();
        numero_de_pecas2 = sc.nextInt();

        valorAPagar = (double) (numero_de_pecas*valor_unitario)+(numero_de_pecas2*valor_unitario2);

        System.out.println(valorAPagar);
sc.close();
    }
}
