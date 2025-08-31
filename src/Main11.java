import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

float a,b,c;
a = sc.nextFloat();
b = sc.nextFloat();
c = sc.nextFloat();


        float area = (float) a*b;

        float preco = (float) c*area;

        System.out.printf("O valor da área é %.2f e o preço do terreno é %.2f", area, preco);

sc.close();

    }
}
