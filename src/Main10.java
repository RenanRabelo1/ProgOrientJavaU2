public class Main10 {
    public static void main(String[] args) {


        byte a = -5;
        byte b = 4;
        byte c = 1;
        int delta =  (b*b) - (4 * a * c);

        double baskara = (-b + Math.sqrt(delta))/(2*a);

        System.out.println(baskara);


    }
}
