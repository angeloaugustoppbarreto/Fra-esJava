///
/// EX01:
///
///  Mário preencheu 3/4 de uma jarra de 500 mL com refresco. Na hora de servir a bebida,
///  ele distribuiu o líquido igualmente em 5 copos de 50 mL,
///  ocupando 2/4 da capacidade de cada um. Com base nestes dados responda: que fração de líquido restou na jarra?///
///
package Fracoes;
import java.util.Scanner;
public class ex01 {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        double totalLiquidoJarra = 500.0;
        double fracaoJarra = 3.0/4.0;
        // totalLiquido jarra multiplicou com o 3.0 e o restante foi dividido, assim obedecendo regras matemáticas
        double restanteJarra = totalLiquidoJarra * fracaoJarra;
        System.out.println("Restante da jarra: "+restanteJarra+ "ml");

        int totalCopos = 5;
        double totalLiquidoServido = 50.0;
        double fracaoCopos = 2.0/4.0;

        double mlCopo = totalLiquidoServido * fracaoCopos;
        System.out.println("ml copo: " +mlCopo+ "ml");

        double totalLiquidoCopos = totalCopos * mlCopo;
        System.out.println("Total ml nos copos: "+totalLiquidoCopos+ "ml");

        // liquido restante

        double liquidoRestante = restanteJarra - totalLiquidoCopos;
        System.out.println("Liquido que sobrou da jarra: "+liquidoRestante+ "ml");

    }
}
