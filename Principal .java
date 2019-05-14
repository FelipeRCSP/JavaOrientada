package principal;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        VerificaNota v= new VerificaNota();
        CalculaNota A1= new CalculaNota();
        CalculaNota A2= new CalculaNota();
        CalculaNota m= new CalculaNota();
        CalculaNota exibe= new CalculaNota();
        Frequencia F=new Frequencia();
        Frequencia Porcent=new Frequencia();
        
        System.out.print("Digite o nome do aluno:");
        String Nome;
        Nome = teclado.nextLine();
        
        System.out.println("");
        System.out.println("Vamos calcular a nota A1 !");
        System.out.print("Digite a nota da P1:");
        double P1 = teclado.nextDouble();
        P1=v.VerificaNota(P1);
 
        System.out.print("Digite a nota do Ma1:");
        double Ma1 = teclado.nextDouble();
        Ma1=v.VerificaNota(Ma1);
    
        System.out.print("Digite a nota do Mb1:");
        double Mb1 = teclado.nextDouble();
        Mb1=v.VerificaNota(Mb1);
        
        double Media1=A1.Calculo(P1, Ma1, Mb1);
        
        System.out.println("");
        System.out.println("Vamos calcular a nota A2 !");
        System.out.print("Digite a nota da P2:");
        double P2 = teclado.nextDouble();
        P2=v.VerificaNota(P2);
       
        System.out.print("Digite a nota do Ma2:");
        double Ma2 = teclado.nextDouble();
        Ma2=v.VerificaNota(Ma2);
        
        System.out.print("Digite a nota do Mb2:");
        double Mb2 = teclado.nextDouble();
        Mb2=v.VerificaNota(Mb2);
        
        double Media2=A2.Calculo(P2, Ma2, Mb2);
        
        //System.out.println("Média A1:"+Media1);
        //System.out.println("Média A2:"+Media2);
    
        double Media=m.calcMedia(Media1,Media2);
       
        System.out.println("");
        System.out.println("Vamos calcular a frequência !");
        System.out.print("Digite a quantidade de aulas da matéria no semestre:");
        float Aulas = teclado.nextFloat();
        
        System.out.print("Digite a quantidade de faltas do aluno no semestre:");
        float Faltas = teclado.nextFloat();
        
        float Frequencia=F.Frequencia(Aulas,Faltas);
        
        String P=Porcent.Frequencia(Frequencia,Media);
        
        System.out.println("");
        System.out.println("Apresentado média,frequência e situação !");
        exibe.exibeMedia(Nome,Media1,Media2,Media,Frequencia,P);
    }
    
}
