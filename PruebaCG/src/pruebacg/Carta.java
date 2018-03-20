/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacg;

/**
 *
 * @author Angel
 */
public class Carta {
    private int numero;
    private int figura;
    private final static String []numeroC = {"As","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","Joto","Reina","Rey"};
    private final static String []figuraC={"Corazones","Rombos","Trebol","Picas"};
    private int valor;
    
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFigura() {
        return figura;
    }

    public void setFigura(int figura) {
        this.figura = figura;
    }

    public Carta(int numero, int figura) {
        this.numero = numero;
        this.figura = figura;
        if (numero<10&&numero >0){
            this.valor=numero+1;
        }
        else if(numero==0) {
            this.valor=11;
        }
        else {
            this.valor=10;
        }
    }
    @Override
    public String toString(){
        
        return numeroC[numero]+" de "+figuraC[figura];
    }
    
    
}
