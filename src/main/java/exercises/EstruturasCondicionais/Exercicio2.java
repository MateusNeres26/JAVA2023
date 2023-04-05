package exercises.EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int num = sc.nextInt();
        int resto = num%2;

        if(resto == 0){
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }
    }
}
