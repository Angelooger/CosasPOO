/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen3_arm;

/**
 *
 * @author Angel
 */
public abstract class Vehiculo implements VerGarantia {
    protected String marca;
    protected double km,anios;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getAnios() {
        return anios;
    }

    public void setAnios(double anios) {
        this.anios = anios;
    }

    public Vehiculo(String marca, double km, double anios) {
        this.marca = marca;
        this.km = km;
        this.anios = anios;
    }
    
    
}
