package exercises.EstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um salário com duas casas decimais: ");

        double salario = sc.nextDouble();
        double imposto = 0.0;


        if( salario >= 0.00 && salario <= 2000.00){
            System.out.println("ISENTO");
        }else if ( salario >= 2000.01 && salario <= 3000.00){
            imposto = (salario - 2000.00) * 0.08;
        }else if(salario >= 3000.01 && salario <= 4500.00){
            imposto = 1000.00 * 0.08 + (salario - 3000.00) * 0.18;
        }else if (salario >= 4500.01){
            imposto = 1000.00 * 0.08 + 1500.00 * 0.18 + (salario - 4500.00) * 0.28;
        }
        System.out.printf("R$ %.2f%n", imposto);
    }
}