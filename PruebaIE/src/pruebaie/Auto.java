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
public class Auto implements ImpactoEcologico {
    private String marca, modelo;
    private double millasRecorridadasalAnio, millasPorGalon;
    private static final double KGPG=9; 

    public double getMillasPorGalon() {
        return millasPorGalon;
    }

    public void setMillasPorGalon(double millasPorGalon) {
        this.millasPorGalon = millasPorGalon;
    }

    
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

   

    public double getMillasRecorridadasalAnio() {
        return millasRecorridadasalAnio;
    }

    public void setMillasRecorridadasalAnio(double millasRecorridadasalAnio) {
        this.millasRecorridadasalAnio = millasRecorridadasalAnio;
    }

    public Auto(String marca, String modelo, double millasRecorridadasalAnio, double millasPorGalon) {
        this.marca = marca;
        this.modelo = modelo;
        this.millasRecorridadasalAnio = millasRecorridadasalAnio;
        this.millasPorGalon = millasPorGalon;
    }
    
    
    @Override
    public double ObtenerEmisionAnualDioxidoCarbono() {
        return this.millasRecorridadasalAnio/this.millasPorGalon*Auto.KGPG;
    }
    
    @Override
    public String toString(){
     return String.format("El auto marca %s, modelo %s, que recorrió %,.2f millas en un año %ntiene un rendimiento de %.2f millas por galón%n",this.marca,this.modelo,this.millasRecorridadasalAnio,this.millasPorGalon);   
    }
    
    
}
