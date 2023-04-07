package exercises.estruturasCondicionais;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora inicial e final do jogo: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int horas = 0;



        if(A < B){
            horas =  (B - A);

        }else {
            horas = 24 - A + B;
        }

        System.out.println("O JOGO DUROU " + horas +" HORAS");

    }




}
