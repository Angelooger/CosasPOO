/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaie;

/**
 *
 * @author Angel
 */
public class Edificio implements ImpactoEcologico{
    public String direccion;
    public double KwH_ConsumidosMensualmente;
    public static final double MESES=12;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getKwH_ConsumidosMensualmente() {
        return KwH_ConsumidosMensualmente;
    }

    public void setKwH_ConsumidosMensualmente(double KwH_ConsumidosMensualmente) {
        this.KwH_ConsumidosMensualmente = KwH_ConsumidosMensualmente;
    }

    public Edificio(String direccion, double KwH_ConsumidosMensualmente) {
        this.direccion = direccion;
        this.KwH_ConsumidosMensualmente = KwH_ConsumidosMensualmente;
    }

    @Override
    public double ObtenerEmisionAnualDioxidoCarbono() {
        return this.KwH_ConsumidosMensualmente*Edificio.MESES;
    }
    @Override
    public String toString(){
        return String.format("El edificio ubicado en %s, consume %,.2fKWH al mes%n",this.direccion,this.KwH_ConsumidosMensualmente);
    }
    
    
}
