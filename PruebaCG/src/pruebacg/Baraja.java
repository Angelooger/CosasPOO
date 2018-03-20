/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacg;

import java.security.SecureRandom;

/**
 *
 * @author Angel
 */
public class Baraja {
    protected Carta[] cartas;
    private int numCarta;
    private static final int  NUMERO_DE_CARTAS=52;
    private static final SecureRandom ALEATORIO= new SecureRandom();

    public Carta[] getCartas() {
        return cartas;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    public int getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(int numCarta) {
        this.numCarta = numCarta;
    }

    
    public Carta repartirCarta(){
        if(numCarta < cartas.length){
            return cartas[numCarta++];
        }else {
            return null;
        }
    }
    public void barajar(){
        numCarta=0;
        for(int pos=0;pos <cartas.length;pos++){
            int numAl=ALEATORIO.nextInt(NUMERO_DE_CARTAS);
            Carta temp;
            temp=cartas[pos];
            cartas[pos]=cartas[numAl];
            cartas[numAl]=temp;
        }
    }

    public Baraja() {
        cartas =new Carta[Baraja.NUMERO_DE_CARTAS];
        for(int pos=0 ;pos < cartas.length;pos++){
            cartas[pos]=new Carta(pos%13,pos/13);
            
        }
    }
    
}
