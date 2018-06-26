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
public class Automovil extends Vehiculo{

    @Override
    public String validarGarantia() {
        if (anios<=7&&km<100000){
            return"Garantia válida\n";
        }
        else{
            if(anios>7){
                return String.format("Tu garantia ha expirado hace %.0f años%n",this.anios-7);
            }
            else{
                return String.format("Tu garantia ha expirado hace %.0f kilometros%n",this.km-100000);
            }
        }
    }

    public Automovil(String marca, double km, double anios) {
        super(marca, km, anios);
    }
    @Override
    public String toString(){
     return String.format("Automovil %s%n%.0f kilometros %n%.0f años de antigüedad%n",this.marca,this.km,this.anios);
    }
    
}
