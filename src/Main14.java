import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte a = sc.nextByte();
        byte b = sc.nextByte();
        byte c = sc.nextByte();
        byte d = sc.nextByte();

        byte diferenca = (byte) (a*b - c*d);

        System.out.println(diferenca);


}}
