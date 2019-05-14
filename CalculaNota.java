package principal;
public class CalculaNota {
    private double P1;
    private double Ma1;
    private double Mb1;
    private double A1;
    private double Media;
    
    void Calculo(){}
    
    double Calculo(double P1, double Ma1, double Mb1) {
       this.P1 = (double) (P1*0.7);
       this.Ma1 = (double) (Ma1*0.2);
       this.Mb1 = (double) (Mb1*0.10);
       A1 = (P1 + Ma1 + Mb1) / 3;
       return A1;
    }
   
    void calcMedia(){}
    
    double calcMedia(double A1,double A2){
    this.Media=(A1+2*A2)/3;
    return Media;
    }
    
    void exibeMedia(){}
    
    void exibeMedia(String Nome,double A1, double A2, double Media,double Freque,String Situ){
     System.out.println("Nome do aluno:"+Nome);
     System.out.format("Média A1:%.2f",A1);
     System.out.println("");
     System.out.format("Média A2:%.2f",A2);
     System.out.println("");
     System.out.format("Média Final:%.2f",Media);
     System.out.println("");
     System.out.format("Frequência:%.0f",Freque);
     System.out.print("%");
     System.out.println("");
     System.out.println("Situação:"+Situ);
    }
    
    public double getP1() {
        return P1;
    }

    /**
     * @param P1 the P1 to set
     */
    public void setP1(double P1) {
        this.P1 = P1;
    }

    /**
     * @return the Ma1
     */
    public double getMa1() {
        return Ma1;
    }

    /**
     * @param Ma1 the Ma1 to set
     */
    public void setMa1(double Ma1) {
        this.Ma1 = Ma1;
    }

    /**
     * @return the Mb1
     */
    public double getMb1() {
        return Mb1;
    }

    /**
     * @param Mb1 the Mb1 to set
     */
    public void setMb1(double Mb1) {
        this.Mb1 = Mb1;
    }

    /**
     * @return the res1
     */
    public double getRes1() {
        return A1;
    }

    /**
     * @param res1 the res1 to set
     */
    public void setRes1(double res1) {
        this.A1 = res1;
    }

    /**
     * @return the Media
     */
    public double getMedia() {
        return Media;
    }

    /**
     * @param Media the Media to set
     */
    public void setMedia(double Media) {
        this.Media = Media;
    }

}
