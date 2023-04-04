package exercises.funcoesMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {

        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do colaborador: ");
        int numFunc = sc.nextInt();
        System.out.println("Digite as horas trabalhadas: ");
        int hTrabalhada = sc.nextInt();
        System.out.println("Digite o valor por hora trabalhados: ");
        double valorPorHora = sc.nextDouble();

        System.out.println("NUMBER = "+ numFunc);
        System.out.printf("SALARY = " + " U$ " + "%.2f\n", hTrabalhada*valorPorHora);

    }
}
