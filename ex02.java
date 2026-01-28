package Fracoes;

public class ex02 {
    public static void main(String[] args){
    //Total arrecadação
    int numPessoas = 20;
    double valorArrecado = 30.0;

    double valorTotalArrecadado = valorArrecado * numPessoas;
    System.out.println("Valor total arrecadado R$: "+valorTotalArrecadado);
    // frações
    double primeiroPremio = 1.0/2.0;
    double segundoPremio = 1.0/3.0;

    double valorPrimeiroPremio = valorTotalArrecadado * primeiroPremio;
    System.out.println("Valor do primeiro premio R$: "+valorPrimeiroPremio);

    double valorSegundoPremio = valorTotalArrecadado * segundoPremio;
        System.out.println("Valor do primeiro premio R$: "+valorSegundoPremio);

    }
}
