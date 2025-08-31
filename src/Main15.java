import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a  = sc.nextInt();
        int horas_trabalhadas = sc.nextInt();
        double recebe_por_hora = sc.nextDouble();

        double salario_funcionario = horas_trabalhadas * recebe_por_hora;

        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", a, salario_funcionario);

        sc.close();
    }
}
