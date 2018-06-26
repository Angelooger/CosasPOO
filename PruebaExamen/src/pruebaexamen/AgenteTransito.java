/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaexamen;

/**
 *
 * @author Angel
 */
public class AgenteTransito extends Agente{
    protected Multa multa1,multa2;
    Multa []arreglo=new Multa[2];
    public AgenteTransito(String Nombre, String Apellido, String Puesto) {
        super(Nombre, Apellido, Puesto);
    }
    
    public static void hacerMulta(String valor, String tipo){
        Multa multa = new Multa(valor, tipo);
    }
}
