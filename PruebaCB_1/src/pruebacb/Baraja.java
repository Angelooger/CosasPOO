/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacb;

import java.security.SecureRandom;
/**
 *
 * @author link_
 */
public class Baraja {
   private Carta[] cartas;
   private int numCarta;
   private static final int NUMERO_DE_CARTAS=52;
   private static final SecureRandom numAle
           =new SecureRandom();
   public Baraja(){
       cartas=new Carta[Baraja.NUMERO_DE_CARTAS];
       numCarta=0;
       
       for(int pos=0;pos<cartas.length;pos++){
           cartas[pos]=new Carta(pos%13,pos/13);
       }
   }
   
   public void barajar(){
       numCarta=0;
       for(int primera=0;primera<cartas.length;primera++){
           int segunda=
           numAle.nextInt(NUMERO_DE_CARTAS);
           Carta temp=cartas[primera];
           cartas[primera]=cartas[segunda];
           cartas[segunda]=temp;
       }
   }
   
   public Carta repartirCarta(){
       if(numCarta<cartas.length){
           return cartas[numCarta++];
       }else{
           return null;
       }
   }
}
