
package principal;

import java.util.Scanner;

public class VerificaNota {
    Scanner teclado = new Scanner(System.in);
    double Verif;
    
    VerificaNota(){}
    
    double VerificaNota(double Verif){
        while(Verif<0 || Verif>10){
        System.out.print("Nota inválida, digite novamente:");
        double v = teclado.nextDouble();   
        Verif=v;
        }
        return Verif;
    }
}
