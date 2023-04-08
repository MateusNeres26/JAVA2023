package exercises.oo;

import exercises.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();

        System.out.print("Salario Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.print("Taxa: ");
        funcionario.taxa = sc.nextDouble();

        System.out.println("Funcionário: " + funcionario.nome + ", " + "$ " + funcionario.salarioLiquido());

        System.out.print("Qual porcentagem para incrementar no salário? ");
        funcionario.taxa = sc.nextDouble();

        System.out.println("Dados atualizados: " + funcionario.nome + ", " + "$ " + funcionario.incrementoSalario());






    }
}
