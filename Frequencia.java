
package principal;

public class Frequencia {
    float Freque;
    String Porcentagem;
    
   void Frequencia(){}
   
   float Frequencia(float Aulas,float Faltas){
     Freque=(Aulas-Faltas)/Aulas;
     Freque=Freque*100;
    return Freque;
   }
   
   String Frequencia(float F,double Media){
     if(Media>5 && F>=75){
      Porcentagem="Aprovado";
     }else if(Media<5 || Media>=3 && F>=75){
      Porcentagem="Recuperação";
     }else if(Media<3 && F>=75){
      Porcentagem="Reprovado por nota !";
     }else if(F<75){
      Porcentagem="Reprovado por falta !";
     }
     return Porcentagem;
   }
}
