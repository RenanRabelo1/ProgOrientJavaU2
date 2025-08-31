public class Main9 {
    public static void main(String[] args) {
        double a = 3;
        double b = 5;
        double c = 7;

        double A,B,C;

        A = Math.sqrt(a);
        B = Math.sqrt(b);
        C = Math.sqrt(c);

        System.out.printf("A raiz quadrada de %.2f é %.2f%n", a, A);
        System.out.printf("A raiz quadrada de %.2f é %.2f%n", b, B);
        System.out.printf("A raiz quadrada de %.2f é %.2f%n", c, C);

        A = Math.pow(a,b);
        B = Math.pow(b,c);
        C = Math.pow(c, a);

        System.out.printf("%.2f elevado a %.2f é igual a %.2f%n", a, b, A);
        System.out.printf("%.2f elevado a %.2f é igual a %.2f%n", b, c, B);
        System.out.printf("%.2f elevado a %.2f é igual a %.2f%n", c, a, C);

        a = -1;
        b = -2;
        c = -3.4;

        A = Math.abs(a);
        B = Math.abs(b);
        C = Math.abs(c);

        System.out.printf("O valor absoluto de %.2f é igual a %.2f%n", a, A);
        System.out.printf("O valor absoluto de %.2f é igual a %.2f%n", b, B);
        System.out.printf("O valor absoluto de %.2f é igual a %.2f%n", c, C);





    }
}
