package exercises.funcoesMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class CalculoAreas {
    public static void main(String[] args) {

/*        fazer um programa que leia três valores com ponto flutuante de dupla precisão:
        a, b e c.em seguida, calcule e
        mostre:
        a)a área do triângulo retângulo que tem a por base e c por altura.
                b)a área do círculo de raio c.(pi = 3.14159)
        c)a área do trapézio que tem a e b por bases e c por altura.
        d)a área do quadrado que tem lado b.
                e)a área do retângulo que tem lados a e b*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double pi = 3.14159;

        System.out.printf("TRIANGULO: %.3f%n", (A * C) / 2);
        System.out.printf("CIRCULO: %.3f%n", pi*Math.pow(C , 2));
        System.out.printf("TRAPEZIO: %.3f%n",((A + B) * C) / 2);
        System.out.printf("QUADRADO: %.3f%n", Math.pow(B, 2));
        System.out.printf("RETANGULO: %.3f%n", A*B) ;

    }
}
