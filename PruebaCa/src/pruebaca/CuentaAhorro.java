/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaca;

/**
 *
 * @author Angel
 */
public class CuentaAhorro {
    private double P;
    private double R;
    private double N;
    private double T;
    private double DineroA;
    private String ClienteNombre;
    private String ClienteApellido;

    public double getP() {
        return P;
    }

    public double getR() {
        return R;
    }

    public double getN() {
        return N;
    }

    public double getT() {
        return T;
    }

    public double getDineroA() {
        return DineroA;
    }

    public String getClienteNombre() {
        return ClienteNombre;
    }

    public String getClienteApellido() {
        return ClienteApellido;
    }

    public void setP(double P) {
        this.P = P;
    }

    public void setR(double R) {
        this.R = R;
    }

    public void setN(double N) {
        this.N = N;
    }

    public void setT(double T) {
        this.T = T;
    }

    public void setDineroA(double DineroA) {
        this.DineroA = DineroA;
    }

    public void setClienteNombre(String ClienteNombre) {
        this.ClienteNombre = ClienteNombre;
    }

    public void setClienteApellido(String ClienteApellido) {
        this.ClienteApellido = ClienteApellido;
    }
    public void CalcularImpuesto(){
        DineroA=P*(Math.pow(1+(R/N),(N*T)));
    }
    public static int ValidarDatos(double P, double R, double N, double T){
        if(P>=0&& R>=0&& N>=0&& T>=0){
            return 1;
        }
        return 0;
    }
    public CuentaAhorro(double P, double R, double N, double T, String ClienteNombre,String ClienteApellido){
     this.P=P;
     this.R=R;
     this.N=N;
     this.T=T;
     this.ClienteNombre=ClienteNombre;
     this.ClienteApellido=ClienteApellido;
    }
}
