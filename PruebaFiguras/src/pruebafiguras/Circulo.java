/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafiguras;

/**
 *
 * @author Angel
 */
public class Circulo extends FiguraBidimensional {
    
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public Circulo(double radio){
        this.radio=radio;
    }
    
    @Override
    public void calcularArea(){
        this.setArea(Math.PI*Math.pow(radio,2.0));
    }
}
