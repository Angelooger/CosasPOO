/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafev;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PruebaFEV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double t,v;
        int val;
        Scanner entrada=new Scanner(System.in);
        do{
            System.out.println("Dame la temperatura ");
            t=entrada.nextDouble();
            System.out.println("Dame la Velocidad ");
            v=entrada.nextDouble();
            System.out.println("-----------------------------");

            val=FactorEnfriamiento.Validardatos(t, v);
        }while(val==0);
        
        FactorEnfriamiento obj1; //Creacion del objeto1 de clase Factor de Enfriamiento
        obj1=new FactorEnfriamiento(t,v); //Se le asigna 
        obj1.calculaFormula();
        System.out.println(obj1.getFe());
        
    }    
}
