package exercises.estruturasCondicionais;

import java.util.Scanner;

public class Exercicio1 {

    //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("NEGATIVO");
        }else {
            System.out.println("NÃO NEGATIVO");
        }
    }

}
