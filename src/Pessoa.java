import java.util.Scanner;

public class Pessoa {

    String nome;
    short anoNascimento;
    double peso;
    double altura;


    public void mostra(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome:");
        nome = sc.next();
        System.out.println("Digite o ano de nascimento:");
        anoNascimento = sc.nextShort();
        System.out.println("Digite o peso:");
        peso = sc.nextDouble();
        System.out.println("Digite a altura:");
        altura = sc.nextDouble();
        double altura_metros = altura/100;
        double IMC = (double) peso / Math.pow(altura_metros, 2);
        int idade = 2025 - anoNascimento;
        double agua = peso*35;

        System.out.printf("O seu IMC é igual a %.2f%n Sua idade é %d, a quantidade de agua que precisa tomar é %.4f:", IMC, idade, agua);

    }
}
