/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacg;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PruebaCB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaString = new Scanner(System.in);
        Baraja baraja1=new Baraja();
        baraja1.barajar();
        
        Carta cartaJ, cartaC1,cartaC2;
        
        String jugar="Si";
        while (baraja1.getNumCarta()<52 &&"Si".equals(jugar)){
        String estado="Si";
        int sumaJ = 0;
        int aces=0;
        int sumaCasa=0;
        int contador=0;
        do{
            cartaJ=baraja1.repartirCarta();
            if (cartaJ.getNumero()==0){
                sumaJ+=cartaJ.getValor();
                aces+=1;
            }
            else{
             sumaJ+=cartaJ.getValor();
            }
        
            System.out.printf("Tu carta es: %s\n",cartaJ);
            
            
            if(sumaJ==21){
                System.out.println("Ganaste");
                break;
            }
            else if (sumaJ>21 && aces==0){
                System.out.println("Perdiste");
                break;
            }
            else if (sumaJ>21 && aces>0){
                sumaJ-=10;
                aces-=1;
            }
            contador+=1;
            if (contador==5){
               System.out.println("Ganaste, conseguiste 5 cartas sin pasarte de 21");
                break; 
            }
            System.out.println("¿Quieres otra carta?");
            estado = entradaString.next();
            
            
        }while(!"No".equals(estado));
        if ("No".equals(estado)){
            cartaC1=baraja1.repartirCarta();
            cartaC2=baraja1.repartirCarta();
            sumaCasa=cartaC1.getValor()+cartaC2.getValor();
            System.out.printf("La casa saca: %s y %s\n",cartaC1.toString(),cartaC2.toString());
            if (sumaCasa<sumaJ){
                System.out.println("Ganaste");
            }
            else if (sumaCasa==sumaJ){
                System.out.println("Empataste");
                
            }
            else {
                
                System.out.println("Perdiste");
            }
            
        }
        System.out.println("¿Quieres jugar?");
        jugar=entradaString.next();
        }
    }
    
    
}
