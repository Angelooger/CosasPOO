/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaec;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PruebaEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double X1,X2,A, B, C;
        int val;
        Scanner entrada=new Scanner(System.in);
        do{
            System.out.println("Dame A ");
            A=entrada.nextDouble();
            System.out.println("Dame B ");
            B=entrada.nextDouble();
            System.out.println("Dame C ");
            C=entrada.nextDouble();
            System.out.println("-----------------------------");

            val=EcuacionCuadratica.validarCoeficientes(A, B, C);
        }while(val==0);
        EcuacionCuadratica obj1;
        obj1 =new EcuacionCuadratica(A, B, C);
        obj1.calcularRaices();
        System.out.println(obj1.getR1());
        System.out.println(obj1.getR2());
    }
    
}
