/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Angel
 */
public class EcuacionCuadratica {
    //Atributos
    private double A;
    private double B;
    private double C;
    private double X1;
    private double X2;
    
    //Metodos
    public double getA(){
        return A;    
    }
    public double getB(){
        return B;
    }
    public double getC(){
        return C;
    }
    public double getX1(){
        return X1;
    }
    public double getX2(){
        return X2;
    }
    public void setA(double nuevaA){
        A=nuevaA;
    }
    public void setB(double nuevaB){
        B=nuevaB;
    }
    public void setC(double nuevaC){
        C=nuevaC;
    }
    public void setX1(double nuevaX1){
        X1=nuevaX1;
    }
    public void setX2(double nuevaX2){
        X2=nuevaX2;
    }
    public static double validarDatos(double A,double B,double C){
        if(A==0||Math.pow(B,2)<4*A*C||C==0){
            return 0;
        }
        return 1;
    }
    public void calcularFormulaX1(){
        X1=(-B+Math.sqrt(Math.pow(B,2)-(4*A*C)))/2*A;
    }
    public void calcularFormulaX2(){
        X2=(-B-Math.sqrt(Math.pow(B,2)-(4*A*C)))/2*A;
    }
    public EcuacionCuadratica(double a,double b, double c){
       A=a;
       B=b;
       C=c;         
   }
}
