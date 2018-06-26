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
public class Bicicleta implements ImpactoEcologico{
    private String marca, modelo, rodada;
    private double millasPorDia;
    private static final double CALORIAS_GENERADAS_POR_MILLA=34;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    public double getMillasPorAnio() {
        return millasPorDia;
    }

    public void setMillasPorAnio(double millasPorAnio) {
        this.millasPorDia = millasPorAnio;
    }

    public Bicicleta(String marca, String modelo, String rodada, double millasPorAnio) {
        this.marca = marca;
        this.modelo = modelo;
        this.rodada = rodada;
        this.millasPorDia = millasPorAnio;
    }
     
    
    @Override
    public double ObtenerEmisionAnualDioxidoCarbono() {
        return this.millasPorDia*365*Bicicleta.CALORIAS_GENERADAS_POR_MILLA/1000;
    }
    @Override
    public String toString(){
        return String.format("La bicicleta marca %s, modelo %s, rodada %s que recorrió %,.2f millas en un año %n",this.marca,this.modelo,this.rodada,this.millasPorDia*365);
    }
}
