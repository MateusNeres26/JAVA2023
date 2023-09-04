package exercises.application;

import exercises.entities.ProdutoVetores;

import java.util.Locale;
import java.util.Scanner;

public class VetoresClasses {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ProdutoVetores[] vect = new ProdutoVetores[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ProdutoVetores(name, price);
        }

        double sum = 0.0;
        for (int i=0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg  = sum / vect.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }

}
