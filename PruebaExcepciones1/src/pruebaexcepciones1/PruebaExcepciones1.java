/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexcepciones1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PruebaExcepciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num1,num2;
        boolean bandera=true;
        do{
            try{
            System.out.println("Damelas");
            num1=entrada.nextInt();
            System.out.println("Damelas x2");
            num2=entrada.nextInt();
            System.out.println(PruebaExcepciones1.division(num1, num2));
            bandera=false;}
            catch(InputMismatchException e){
                entrada.nextLine();
                System.out.println("Damn it! Así No!");
                System.err.printf("Excepcion: %s%n",e);
            }
            catch(ArithmeticException e){
                entrada.nextLine();
                System.out.println("No se puede dividir entre 0, Burro!");
                System.err.printf("Excepcion: %s%n",e);
            }
        }while(bandera);
        
    }
    public static int division(int num1,int num2){
        return num1/num2;
    }
    
}
