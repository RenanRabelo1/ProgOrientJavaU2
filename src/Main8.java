import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        String y, a, b, c;
        x = sc.nextInt();
        y = sc.nextLine();
        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.nextLine();

        System.out.printf("Dados digitados:%n %d%n %s%n %s%n %s%n %s%n", x, a, b, c, y);
        sc.close();
    }
}
