/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagui3;

import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Angel
 */
public class Ventana1 extends JFrame{
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3, etiqueta4;
    
    public Ventana1(){
        super("Etiquetas");
        this.setLayout(new FlowLayout());
        etiqueta1= new JLabel("Etiqueta con texto");
        etiqueta1.setToolTipText("Esta es la etiqueta1");
        add(etiqueta1);
        
        Icon imagen = new ImageIcon(getClass().getResource("home.png"));
        etiqueta2= new JLabel("Etiqueta con texto e icono",imagen,SwingConstants.LEFT);
        etiqueta2.setToolTipText("Esta es la etiqueta 2");
        add(etiqueta2);
        
        Icon image = new ImageIcon(getClass().getResource("Icon.png"));
        
        etiqueta3 = new JLabel();
        etiqueta3.setText("Etiqueta con texto e icono en la parte inferior");
        etiqueta3.setIcon(image);
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        //etiqueta3= new JLabel("Etiqueta con texto e icono en la parte inferior",imagen,SwingConstants.LEFT);
        etiqueta3.setToolTipText("Esta es la etiqueta 3");
        add(etiqueta3);
        
        
        etiqueta4= new JLabel("Etiqueta con texto e icono",image,SwingConstants.LEFT);
        etiqueta4.setToolTipText("Puros memingos");
        add(etiqueta4);
                
    }
}
