/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacb;

/**
 *
 * @author link_
 */
public class Carta {
    private int numero;
    private int figura;
    private static final String [] numeros={"As",
     "Dos","Tres","Cuatro","Cinco","Seis",
     "Siete","Ocho","Nueve","Diez","Joto",
    "Reina","Rey"};
    private static final String [] figuras={"Corazones",
    "Diamentes", "Treboles","Picas"};

    public int getNumero() {
        return numero;
    }

    public int getFigura() {
        return figura;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFigura(int figura) {
        this.figura = figura;
    }   
    
    public Carta(int numero, int figura){
        this.numero=numero;
        this.figura=figura;
    }
    
    @Override
    public String toString(){
     return numeros[this.numero]+" de "
             +figuras[this.figura];
    }
    
}
