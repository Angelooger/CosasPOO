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
public class Motocicleta extends Vehiculo{

    @Override
    public String validarGarantia() {
        if (anios<=1&&km<20000){
            return"Garantia válida\n";
        }
        else if(anios>1){
                return String.format("Tu garantia ha expirado hace %.0f años%n",this.anios-1);
            }
        else{
                return String.format("Tu garantia ha expirado hace %.0f kilometros%n",this.km-20000);
            }
        }
    
    @Override
    public String toString(){
        return String.format("Motocicleta %s%n%.0f kilometros %nde %.0f años de antigüedad%n",this.marca,this.km,this.anios);
    }
    

    public Motocicleta(String marca, double km, double anios) {
        super(marca, km, anios);
    }
    
    
}
