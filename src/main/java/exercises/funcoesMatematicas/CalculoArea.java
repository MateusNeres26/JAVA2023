package exercises.funcoesMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {

        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.
        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double raio =  sc.nextDouble();
        System.out.printf("A = " + "%.4f%n" , pi*Math.pow(raio, 2));

    }
}
