/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebad;

/**
 *
 * @author Angel
 */
public class Desplazamiento {
    private double X;
    private double V;
    private double T;
    private double D;

    public double getX() {
        return X;
    }

    public double getV() {
        return V;
    }

    public double getT() {
        return T;
    }

    public double getD() {
        return D;
    }

    public void setX(double X) {
        this.X = X;
    }

    public void setV(double V) {
        this.V = V;
    }

    public void setT(double T) {
        this.T = T;
    }

    public void setD(double D) {
        this.D = D;
    }
    public Desplazamiento(double X,double V,double T){
        this.X=X;
        this.V=V;
        this.T=T;
    }
    public void calcularDesplazamiento(){
        D=X+V*T-((9.80665)*Math.pow(T,2))/2;
    }
    public static int validarDatos(double x, double v, double t){
       if(x>=0&&v>=0&&t>0){
            return 1;
        }
        return 0; 
    }
}
