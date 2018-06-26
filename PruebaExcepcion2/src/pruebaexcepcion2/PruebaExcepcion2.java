/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexcepcion2;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PruebaExcepcion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Scanner entrada =  new Scanner(System.in);
            System.out.println("Dame un número");
            int num = entrada.nextInt();
            PruebaExcepcion2.LanzarExcepcion(num);
            
        } catch (Exception ex) {
            System.err.println("La excepcion de manejo dentro de main");
        }
        
    }
    public static void LanzarExcepcion(int num) throws Exception {
     try{
         if(num==1){
          throw new Exception();   
         }
         //throw new Exception();
     }catch(Exception exception){
         System.err.println("La cagaste man");
         throw exception;
     }finally{
         System.err.println("Soy final... Finally");
     }   
    }
}
