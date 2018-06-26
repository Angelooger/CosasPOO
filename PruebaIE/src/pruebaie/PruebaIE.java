/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaie;

/**
 *
 * @author Angel
 */
public class PruebaIE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ImpactoEcologico [] arreglo=new ImpactoEcologico[3];
        arreglo[0]=new Auto("Mazda","2012",13461,6);
        arreglo[1]=new Bicicleta("Benotto","Tunder","16",8);
        arreglo[2]=new Edificio("Calle bonita",1256412);
        
        for(ImpactoEcologico x:arreglo){
            System.out.print(x.toString());
            System.out.printf("Emite %,.2f kilogramos de Dioxido de carbono al año%n%n",x.ObtenerEmisionAnualDioxidoCarbono());
        }
        
    }
    
}
