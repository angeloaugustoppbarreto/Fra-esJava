package Fracoes;

// Uma barra de chocolate tem 18 unidades, quantas unidades devo
// consumir para atingir 5/6 da barra?

import java.util.Scanner;
public class ex00 {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        //defino quantidade que vou multiplicar
        int fracao = 5/6;

        // pego valor [n]
        System.out.println("qual o valor [N] que devo multiplicar por 5/6?: ");
        int unidadeTotal = user.nextInt();

        // calculo
        int resultado = unidadeTotal * fracao;

        System.out.println("Quantidade: "+unidadeTotal);
        user.close();



    }
}
