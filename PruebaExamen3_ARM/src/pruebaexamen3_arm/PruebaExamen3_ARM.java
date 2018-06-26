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
public class PruebaExamen3_ARM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VerGarantia []arreglo=new VerGarantia[8];
        arreglo[0]=new Pantalla("LG","55","OLED",7);
        arreglo[1]=new Pantalla("Sony","70","LED",18);
        arreglo[2]=new Motocicleta("Honda",19000,3);
        arreglo[3]=new Motocicleta("BMW",22000,1);
        arreglo[4]=new Motocicleta("Yamaha",10000,1);
        arreglo[5]=new Automovil("Mercedez Benz",40000,5);
        arreglo[6]=new Automovil("Jeep",120000,5);
        arreglo[7]=new Automovil("Volkswagen",30000,9);
        
        for (VerGarantia K:arreglo){
            System.out.printf("%s%s%n",K.toString(),K.validarGarantia());
        }
        
    }
    
}
