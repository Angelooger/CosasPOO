/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagui3;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Angel
 */
public class Ventana1 extends JFrame{
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    
    public Ventana1(){
        super("Etiquetas");
        this.setLayout(new FlowLayout());
    }
}
