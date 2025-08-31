import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        double y;
        String s;

        x = sc.nextInt();
        y = sc.nextDouble();
        s = sc.next();

        System.out.printf("Você digitou:%n %d%n %.2f%n %s%n", x, y, s);



    }
}
