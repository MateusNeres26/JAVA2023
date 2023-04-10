package exercises.oo;

import exercises.util.ConversaoAtual;

import java.util.Locale;
import java.util.Scanner;

public class CotacaoDolar {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotação do dolar: ");
        double precoDolar = sc.nextDouble();

        System.out.print("Digite a quantidade que deseja: ");
        double qtdDolar = sc.nextDouble();
        double resultado = ConversaoAtual.dollarToReal(qtdDolar, precoDolar);
        System.out.printf("Montante a ser pago em Reais: %.2f%n", resultado);

    }


}
