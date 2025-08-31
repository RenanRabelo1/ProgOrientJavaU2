import java.util.Scanner;

public class Produto {
    int [] produtos;
    int [] pesos;
    int [] valores;
    int n;
    int i = 0;
    int m10m50 = 0;
    int leve_peso = Integer.MAX_VALUE;
    int leve_codigo;
    int leve_valor;
    int pesado_peso;
    int pesado_codigo;
    int pesado_valor = 0;
    int m10 = 0;
    int cont10 = 0;
    int soma_produtos = 0;


    public void vetor(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos produtos você quer?");
        n = sc.nextInt();

        produtos = new int[n];
        pesos = new int[n];
        valores = new int[n];

        while(i < n){
            System.out.printf("Qual o código do %d° produto?%n", i+1);
            produtos [i]= sc.nextInt();
            System.out.printf("Qual o peso do %d° produto?%n", i+1);
            pesos [i] = sc.nextInt();
            System.out.printf("Qual o valor do %d° produto?%n", i+1);
            valores [i] = sc.nextInt();
        if(valores[i] < 50 && pesos[i] > 10){
            m10m50++;
        }
        if(leve_peso > pesos[i]){
                leve_peso = pesos[i];
                leve_codigo = produtos[i];
                leve_valor = valores[i];
            }
        if(pesado_valor < valores[i]){
            pesado_peso = pesos[i];
            pesado_codigo = produtos[i];
            pesado_valor = valores[i];
        }
        if(pesos[i]>10){
            m10 += valores[i];
            cont10++;
        }
        soma_produtos += pesos[i];
        i++;
        }

        System.out.println("A quantidade de produtos com peso maior que 10 e valor menor que 50 é"+ m10m50);
        System.out.printf("A média dos pesos é %.2f%n", (double) soma_produtos/n);
        System.out.printf("O produto mais leve tem o código de %d%nValor: %d%nPeso: %d%n", leve_codigo, leve_valor, leve_peso);
        System.out.printf("O produto mais pesado tem o código: %d%nValor: %d%nPeso: %d%n", pesado_codigo, pesado_valor, pesado_peso);
        if(cont10 >0){
        System.out.println("A média dos valores que o peso do produto é maior que 10 é: " + (double) m10/cont10);}
        else {
            System.out.println("Não existem produtos que o peso é maior que 10");
        }
sc.close();

    }
}
