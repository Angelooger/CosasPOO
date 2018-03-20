/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaec;

/**
 *
 * @author Angel
 */
public class EcuacionCuadratica {
    
    private double A;
    private double B;
    private double C;
    private double r1;
    private double r2;
    
    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }

    public double getR1() {
        return r1;
    }

    public double getR2() {
        return r2;
    }

    public void setA(double A) {
        this.A = A;
    }

    public void setB(double B) {
        this.B = B;
    }

    public void setC(double C) {
        this.C = C;
    }

    public void setR1(double r1) {
        this.r1 = r1;
    }

    public void setR2(double r2) {
        this.r2 = r2;
    }
    public EcuacionCuadratica(double A,double B,double C){
        this.A=A;
        this.B=B;
        this.C=C;
    }
    public void calcularRaices(){
        r1=(-B+Math.sqrt(Math.pow(B,2.0)-4*A*C))/(2*A);
        r2=(-B-Math.sqrt(Math.pow(B,2.0)-4*A*C))/(2*A);
    }
    public static int validarCoeficientes(double a,double b,double c){
        if(Math.abs(a)>0&&Math.pow(b,2)>=4*a*c){
            return 1;
        }
        return 0;
    }
    
}
