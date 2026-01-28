package Fracoes;
/// 03)
///  Em uma disputa entre carros de corrida um competidor estava a 2/7 de terminar a prova quando sofreu
///  um acidente e precisou abandoná-la.
///  Sabendo que a competição foi realizada com 56 voltas no autódromo, em que volta o competidor foi retirado da pista?
///
/// ///
public class ex03 {
    public static void main(String[] args){
        int numVoltas = 56;
        double fracaoPista = 2.0/7.0;

        double voltaFaltando = numVoltas * fracaoPista;
        System.out.println("volta: "+voltaFaltando);

        double voltasCompletadas = numVoltas - voltaFaltando;

        // Resultado
        System.out.println("Total de voltas da prova: " + numVoltas);
        System.out.println("Voltas que faltavam: " + voltaFaltando);
        System.out.println("Voltas completadas pelo competidor: " + voltasCompletadas);
        System.out.println("O competidor foi retirado da pista na volta: " + (int) voltasCompletadas);
    }
}
