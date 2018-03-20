/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacb;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author link_
 */
public class PruebaCB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           int cA = 
           ThreadLocalRandom.current().nextInt(0, 12 + 1);
           int cP = 
           ThreadLocalRandom.current().nextInt(0, 12 + 1);
           int cf=
           ThreadLocalRandom.current().nextInt(0, 3 + 1);
           
           Carta c1,c2;
           c1=new Carta(cA,cf);
           c2=new Carta(cP,cf);
           System.out.println("La carta del Alumno es:");
           System.out.println(c1.toString());
           System.out.println("La carta del Profesor es:");
           System.out.println(c2.toString());
           if(c1.getNumero()>c2.getNumero()){
               System.out.println("El alumno gana puntos");
           }else if(c1.getNumero()==c2.getNumero()){
               System.out.println("El alumno empato tiene otra oportunidad");
           }else{
               System.out.println("El alumno perdio suerte para la próxima");
           }
           /*
           Baraja baraja1= new Baraja();
           baraja1.barajar();
           for(int i=1; i<=52; i++){
               System.out.print(
                baraja1.repartirCarta()+" ");
               if(i%2==0)
                       System.out.println();
           }
           */
        
    }
    
}
