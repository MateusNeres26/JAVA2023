package exercises.EstruturasDeRepeticao;

import java.awt.*;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        /*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.

        Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim).
        Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido).

         O programa será encerrado quando o código informado for o número 4.

        Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        exemplo*/

        Scanner sc = new Scanner(System.in);

        int Alcool = 0;
        int Gasolina = 0;
        int Diesel = 0;


        System.out.println("Digite o código do cumbustível");
        int cod = sc.nextInt();

        while(cod != 4){
            if( cod == 1){
                Alcool += 1;

            }else if (cod == 2){
                Gasolina += 1;

            }else if (cod == 3){
                Diesel += 1;

            }else if( cod > 5 ){
                System.out.println("Código invalido digite novamente");
            }

            cod = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + Alcool);
        System.out.println("Gasolina: " + Gasolina);
        System.out.println("Diesel: " + Diesel);
    }
}
