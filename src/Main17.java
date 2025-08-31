import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C, tri, cir, tra, qua, ret, pi;
        pi = 3.14;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        tri = (A * C)/2;
        cir = pi * Math.pow(C, 2);
        tra = ((A+B)/2)*C;
        qua = Math.pow(B, 2);
        ret = A*B;

        System.out.printf("Área do triângulo = %.3f%nÁrea do círculo = %.3f%nÁrea do trapézio = %.3f%n", tri, cir, tra);
        System.out.printf("Área do quadrado = %.3f%nÁrea do Retângulo = %.3f", qua, ret);



    }
}
