import java.util.Locale;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner x = new Scanner(System.in);

        double y;

        y = x.nextDouble();

        System.out.println("Você digitou: " + y);
    }
}
