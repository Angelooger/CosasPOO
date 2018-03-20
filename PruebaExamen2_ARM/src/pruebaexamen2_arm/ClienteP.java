/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen2_arm;

/**
 *
 * @author Angel
 */
public class ClienteP extends ClienteN{
    private int nivelP;
    private double millasVF;


    public int getNivelP() {
        return nivelP;
    }

    public void setNivelP(int nivelP) {
        this.nivelP = nivelP;
    }

    public double getMillasVF() {
        return millasVF;
    }

    public void setMillasVF(double millasVF) {
        this.millasVF = millasVF;
    }

    public ClienteP(int nivelP, double millasVF, String nombre, String apellidoP, String apellidoM, String direccion, String numeroT, String usuario, String contraseña, Reservacion reservacion1, Reservacion reservacion2) {
        super(nombre, apellidoP, apellidoM, direccion, numeroT, usuario, contraseña, reservacion1, reservacion2);
        this.nivelP = nivelP;
        this.millasVF = millasVF;
    }

}
