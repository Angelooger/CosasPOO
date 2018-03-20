/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagui1;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class PruebaGUI1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String num1;
    String num2;
    
    num1=JOptionPane.showInputDialog("Dame el primer número");
    num2=JOptionPane.showInputDialog("Dame el segundo número");
    
    double resultado;
    
    resultado = Double.parseDouble(num1) + Double.parseDouble(num2);
    JOptionPane.showMessageDialog(null,"El resultado es: "+resultado,"Suma de dos números",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
