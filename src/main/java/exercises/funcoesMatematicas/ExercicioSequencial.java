package exercises.funcoesMatematicas;

import java.util.Scanner;

public class ExercicioSequencial {
    public static void main(String[] args) {
        //Faça um programa para ler dois valores inteiros,
        // e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
        Scanner sc = new Scanner(System.in);

        //EXERCÍCIO 1
        int a = sc.nextInt(); // Ou insira o valor diretamente na váriável.
        int b = sc.nextInt();
        int soma = a + b;

        System.out.println("SOMA = " + soma);

        int c = -30;
        int d = 10;
        int soma1 = c + d;

        System.out.println("SOMA = " + soma1);

        int e = 0;
        int f = 0;
        int soma2 = e + f;

        System.out.println("SOMA = " + soma2);



    }
}
