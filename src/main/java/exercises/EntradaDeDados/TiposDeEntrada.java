package exercises.EntradaDeDados;

import java.util.Scanner;

public class TiposDeEntrada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;
        System.out.println("Digite um Nome: ");
        x = sc.next();
        System.out.println("Digite um Número inteiro: ");
        y = sc.nextInt();
        System.out.println("Digite um numero de ponto flutuante: ");
        z = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
