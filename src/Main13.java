import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14;
        int r = sc.nextInt();
        double a =(double) (pi*(Math.pow(r, 2)));

        System.out.printf(".%4f", a);
        sc.close();

    }
}
