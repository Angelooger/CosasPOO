/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebad;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PruebaD {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double X,V,T,D;
        int val;
        Scanner entrada=new Scanner(System.in);
        do{
            System.out.println("Dame X ");
            X=entrada.nextDouble();
            System.out.println("Dame V ");
            V=entrada.nextDouble();
            System.out.println("Dame T ");
            T=entrada.nextDouble();
            System.out.println("-----------------------------");

            val=Desplazamiento.validarDatos(X,T,V);
        }while(val==0);
        Desplazamiento obj1;
        obj1 = new Desplazamiento(X,T,V);
        obj1.calcularDesplazamiento();
        System.out.println("El desplazamiento horizontal es de: "+obj1.getD());
    }
    
}
