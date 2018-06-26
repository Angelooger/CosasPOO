/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaventanas;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Angel
 */
public class OtraVentana extends JFrame{
    public OtraVentana(){
        super("Otraventana");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JLabel("Esta es otra ventana"));
        this.setSize(300,300);
        this.setVisible(true);
        
    }
}
