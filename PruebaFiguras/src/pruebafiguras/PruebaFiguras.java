/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafiguras;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PruebaFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        double r;
        System.out.println("Damelas ");
        r=entrada.nextDouble();
        Circulo obj=new Circulo(r);
        obj.calcularArea();
        System.out.println("Area "+obj.getArea());
    }
    
}
