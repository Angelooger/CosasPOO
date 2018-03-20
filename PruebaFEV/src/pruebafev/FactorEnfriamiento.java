/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafev;

/**
 *
 * @author Angel
 */
public class FactorEnfriamiento {
    //Atributos
    private double temp;
    private double vel;
    private double fe;
    
    //Metodos
    public double getTemp(){
        return temp;
    }
   public double getVel(){
       return vel;
   }
   public double getFe(){
       return fe;
   }
   public void setTemp(double nuevaTemp){
       temp=nuevaTemp;
   }
   public void setVel(double nuevaVel){
       vel=nuevaVel;
   }
   public void setFe(double nuevaFe){
       fe=nuevaFe;
   }
   public void calculaFormula(){
       fe=35.74+0.6215*temp+(0.4275-35.75)*Math.pow(vel,0.16);
   }
   public FactorEnfriamiento(double t, double v){
       temp=t;
       vel=v;
   }
   public static int Validardatos(double t, double v){
       /*//primer caso, formula no valida
       if (Math.abs(t)>50 || v<3 || v>120){
       return 0;
       }
       return 1;*/
       //segundo caso, formula valida
       if (Math.abs(t)<=50&&v>=3&&v<=120){
       return 1;
       }
       return 0;
   }
}
