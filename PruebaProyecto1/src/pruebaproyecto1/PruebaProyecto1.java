/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaproyecto1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Angel
 */
public class PruebaProyecto1 extends JFrame implements ActionListener{
     private JLabel etiqueta1;
     private JLabel etiqueta2;
     private JLabel etiqueta3, etiqueta4;
     private JButton boton1;
     
     public PruebaProyecto1(){
        super("GUI básica");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setSize(300,300);
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
        boton1=new JButton("Abrir una nueva ventana");
        
        boton1.addActionListener(this);
        boton1.setActionCommand("Open");
        add(boton1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PruebaProyecto1 ventana= new PruebaProyecto1();
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    String comando;
        comando=e.getActionCommand();
        if(comando.equals("Open")){
            this.dispose();
            new VentanaPrincipal2();
    }
    
}
}
