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
public class Pantalla implements VerGarantia{
    private String fabricante,pulg,tipo;
    private double mesesAnti;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPulg() {
        return pulg;
    }

    public void setPulg(String pulg) {
        this.pulg = pulg;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMesesAnti() {
        return mesesAnti;
    }

    public void setMesesAnti(double mesesAnti) {
        this.mesesAnti = mesesAnti;
    }

    public Pantalla(String fabricante, String pulg, String tipo, double mesesAnti) {
        this.fabricante = fabricante;
        this.pulg = pulg;
        this.tipo = tipo;
        this.mesesAnti = mesesAnti;
    }

    @Override
    public String validarGarantia() {
        if(mesesAnti<=12){
            return"Garantia Válida\n";
        }
        else{
            return String.format("Tu garantia ha expirado hace %.0f meses%n",this.mesesAnti-12);
        }
    }
    
    @Override
    public String toString(){
        return String.format("Pantalla %s de %s pulgadas tipo %s %nde %.0f meses de antigüedad%n",this.fabricante,this.pulg,this.tipo,this.mesesAnti);
    }
    
}
