package exercises.estruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println(" Digite o Código do item e a quantidade desejada:");
        int cod = sc.nextInt();
        if (cod >= 1 && cod <= 5) {
            int quantidade = sc.nextInt();
            double cod1 = 4;
            double cod2 = 4.50;
            double cod3 = 5.00;
            double cod4 = 2.00;
            double cod5 = 1.50;


            if (cod == 1) {
                System.out.printf("TOTAL: %.2f%n ", cod1 * quantidade);
            } else if (cod == 2) {
                System.out.printf("TOTAL: %.2f%n ", cod2 * quantidade);
            } else if (cod == 3) {
                System.out.printf("TOTAL: %.2f%n ", cod3 * quantidade);
            } else if (cod == 4) {
                System.out.printf("TOTAL: %.2f%n ", cod4 * quantidade);
            } else {
                System.out.printf("TOTAL: %.2f%n ", cod5 * quantidade);
            }
        } else{
            System.out.println("Código inválido, digite entre 1 e 5");
        }
    }
}
