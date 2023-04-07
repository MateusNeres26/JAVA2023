package exercises.estruturasDeRepeticao.exerciosFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double teste, teste1, teste2, mediaPonderada;

        for (int i = 1; i <= N; i++){
            teste = sc.nextDouble();
            teste1 = sc.nextDouble();
            teste2 = sc.nextDouble();

            mediaPonderada = (teste * 2 + teste1 * 3 + teste2 * 5)/(2 + 3 + 5);
            System.out.printf("%.1f%n", mediaPonderada);
        }
    }

}
